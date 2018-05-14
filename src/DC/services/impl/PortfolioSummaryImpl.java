package DC.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DC.services.model.PortfolioAccounts;
import DC.services.model.PortfolioDetails;
import DC.services.model.PortfolioSummaryRequest;
import DC.services.model.PortfolioSummaryResponse;

public class PortfolioSummaryImpl extends DCServicesImpl {

	public PortfolioSummaryImpl() {
		super();
	}

	public PortfolioSummaryResponse getPortfolioSummary(PortfolioSummaryRequest portfolioSummaryRequest) {
		PortfolioSummaryResponse portfolioSummaryResponse = new PortfolioSummaryResponse();
		
		/*PortfolioSummaryResponse.Account account = new PortfolioSummaryResponse.Account();
		portfolioSummaryResponse.getAccount().add(account);
		portfolioSummaryResponse.getAccount().add(account);
		portfolioSummaryResponse.getAccount().add(account);*/

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = ConnectionManager.openConnection();
			pstmt = conn.prepareStatement("select * from TABLE(PKG_DC_ACNTDTLS.SP_ACNTDTLS_API(?,?,?,?))");
			pstmt.setInt(1, 1);
			pstmt.setInt(2, portfolioSummaryRequest.getCif());
			pstmt.setString(3, "AC");
			pstmt.setInt(4, portfolioSummaryRequest.getCif());
			rs = pstmt.executeQuery();
			String strLine="";
			while (rs.next()) {
				strLine = rs.getString(1);
				if (portfolioSummaryResponse.getERROR().isEmpty()
						&& portfolioSummaryResponse.getNO_OF_ACCOUNTS().isEmpty()) {
					initializeMap(strLine);
					setFieldValues("DC.services.model.PortfolioSummaryResponse");

					if (anObject != null) {
						portfolioSummaryResponse = (PortfolioSummaryResponse) anObject;
					}
				}
				PortfolioAccounts portfolioAccounts = new PortfolioAccounts();
				
				StringBuffer strDetails = new StringBuffer(strLine);
				strDetails.replace(strDetails.indexOf("#"), strDetails.length(), "");
				initializeMap(strDetails.toString());
				setFieldValues("DC.services.model.PortfolioAccounts");
				if (anObject != null) {
					portfolioAccounts = (PortfolioAccounts) anObject;
					portfolioSummaryResponse.getAccount().add(portfolioAccounts);
				}
				
				strDetails = new StringBuffer(strLine);
				strDetails.replace(0, strDetails.indexOf("#")+1, "");
				strDetails.replace(strDetails.indexOf("#"), strDetails.length(), "");
				for(String str : strDetails.toString().split("~~")) {
					initializeMap(str);
					setFieldValues("DC.services.model.PortfolioDetails");
					if (anObject != null) {
						portfolioAccounts.getDetails().add((PortfolioDetails)anObject);
					}
				}
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return portfolioSummaryResponse;
	}

}
