package DC.services.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import DC.services.model.CustomerDeatilsRequest;
import DC.services.model.CustomerDetailResponse;

public class CustomerDetailsImpl extends DCServicesImpl {

	public CustomerDetailsImpl() {
		super();
	}

	public CustomerDetailResponse getCustomerDetails(CustomerDeatilsRequest customerDetailRequest) {
		CustomerDetailResponse customerDetailResponse = new CustomerDetailResponse();
		Connection conn = null;
		CallableStatement cstmt = null;
		String output = "";
		try {
			conn = ConnectionManager.openConnection();
			cstmt = conn.prepareCall("{call pkg_dc_api_handlr.fn_process_cust_detail_req(?,?)}");
			cstmt.setInt(1, customerDetailRequest.getCif());
			cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			cstmt.execute();
			output = cstmt.getString(2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (cstmt != null) {
					cstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		initializeMap(output);

		setFieldValues("DC.services.model.CustomerDetailResponse");
		
		if(anObject!=null) {
			customerDetailResponse = (CustomerDetailResponse) anObject;
		}
		
		/*Field[] fields = CustomerDetailResponse.class.getDeclaredFields();
		for (Field field : fields) {
			if (field.getName().equals("V_FIRST_NAME") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_FIRST_NAME(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_SECOND_NAME") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_SECOND_NAME(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_FULL_NAME") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_FULL_NAME(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_MOTHER_NAME") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_MOTHER_NAME(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_COUNTRY_CODE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_COUNTRY_CODE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_BIRTH_DATE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_BIRTH_DATE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_OPEN_DATE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_OPEN_DATE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_SEX") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_SEX(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CLIENT_TYPE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CLIENT_TYPE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_EMPLOY_TYPE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_EMPLOY_TYPE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_SEGMENT_CODE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_SEGMENT_CODE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_BUSDIVN_CODE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_BUSDIVN_CODE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_ARM_CODE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_ARM_CODE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_BRN_CODE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_BRN_CODE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CUST_ADDRESS") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CUST_ADDRESS(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CUST_ADDR1") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CUST_ADDR1(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CUST_ADDR2") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CUST_ADDR2(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CUST_ADDR3") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CUST_ADDR3(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CUST_ADDR4") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CUST_ADDR4(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CUST_ADDR5") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CUST_ADDR5(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_LOCN_CODE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_LOCN_CODE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_CONTACT_NO") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_CONTACT_NO(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_EMAIL_ID") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_EMAIL_ID(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_RES_TELNO") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_RES_TELNO(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_OFF_TELNO") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_OFF_TELNO(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_FAX_NO") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_FAX_NO(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_CLIENT_NAME") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_CLIENT_NAME(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_INCORP_DATE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_INCORP_DATE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_INCORP_CNTRY") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_INCORP_CNTRY(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_NUM") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_NUM(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_DATE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_DATE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_EXPIRY_DATE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_EXPIRY_DATE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_OFF_ADDR1") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_OFF_ADDR1(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_OFF_ADDR2") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_OFF_ADDR2(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_OFF_ADDR3") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_OFF_ADDR3(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_OFF_ADDR4") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_OFF_ADDR4(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_REG_OFF_ADDR5") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_REG_OFF_ADDR5(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_COUNTRY_DESC") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_COUNTRY_DESC(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_BC_GROSS_TURNOVER") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_BC_GROSS_TURNOVER(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_AUTHORIZED_CAPITAL") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_AUTHORIZED_CAPITAL(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_ISSUED_CAPITAL") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_ISSUED_CAPITAL(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_PAIDUP_CAPITAL") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_PAIDUP_CAPITAL(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_NETWORTH_AMT") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_NETWORTH_AMT(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_BRANCH_NAME") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_BRANCH_NAME(mapVariables.get(field.getName()));
			} else if (field.getName().equals("W_NATURE_OF_BUS1") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setW_NATURE_OF_BUS1(mapVariables.get(field.getName()));
			} else if (field.getName().equals("V_PIN_CODE") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setV_PIN_CODE(mapVariables.get(field.getName()));
			} else if (field.getName().equals("ERROR") && mapVariables.containsKey(field.getName())) {
				customerDetailResponse.setERROR(mapVariables.get(field.getName()));
			}
		}*/
		return customerDetailResponse;
	}

	
}
