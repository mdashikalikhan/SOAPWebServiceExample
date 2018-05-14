package DC.services.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "PortfolioSummaryResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "ERROR", "NO_OF_ACCOUNTS", "account" })
public class PortfolioSummaryResponse {
	@XmlElement(name = "total_accounts")
	private String NO_OF_ACCOUNTS = "";
	@XmlElement(name = "error")
	private String ERROR = "";
	private List<PortfolioAccounts> account;

	public PortfolioSummaryResponse() {
		account = new ArrayList<PortfolioAccounts>();
	}

	/*@XmlRootElement(name = "account")
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(propOrder = { "W_ACTUAL_ACC", "W_ACC_NAME", "W_ACTYPE_DESCN", "W_PRODUCT_CODE", "W_CURR_CODE",
			"W_PRODUCT_FOR_DEPOSITS", "W_PRODUCT_CONTRACT_ALLOWED", "W_PRODUCT_FOR_LOANS", "details" })
	public static class Account {
		@XmlElement(name = "account_code")
		private String W_ACTUAL_ACC = "";
		@XmlElement(name = "account_name")
		private String W_ACC_NAME = "";
		@XmlElement(name = "account_type")
		private String W_ACTYPE_DESCN = "";
		@XmlElement(name = "account_currency")
		private String W_CURR_CODE = "";
		@XmlElement(name = "account_product")
		private String W_PRODUCT_CODE = "";
		@XmlElement(name = "deposit_account")
		private String W_PRODUCT_FOR_DEPOSITS = "";
		@XmlElement(name = "contract_account")
		private String W_PRODUCT_CONTRACT_ALLOWED = "";
		@XmlElement(name = "loan_account")
		private String W_PRODUCT_FOR_LOANS = "";
		private List<Details> details;
		
		public Account() {
			details = new ArrayList<PortfolioSummaryResponse.Account.Details>();
		}

		@XmlRootElement(name = "details")
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(propOrder= {"W_ACT_ACCNUM", "VAR_AVAILABLE_BAL"})
		public static class Details {
			@XmlElement(name = "code")
			private String W_ACT_ACCNUM;
			@XmlElement(name = "available_balance")
			private String VAR_AVAILABLE_BAL;
			public String getW_ACT_ACCNUM() {
				return W_ACT_ACCNUM;
			}
			public void setW_ACT_ACCNUM(String w_ACT_ACCNUM) {
				W_ACT_ACCNUM = w_ACT_ACCNUM;
			}
			public String getVAR_AVAILABLE_BAL() {
				return VAR_AVAILABLE_BAL;
			}
			public void setVAR_AVAILABLE_BAL(String vAR_AVAILABLE_BAL) {
				VAR_AVAILABLE_BAL = vAR_AVAILABLE_BAL;
			}
			
		}
		
		public String getW_ACTUAL_ACC() {
			return W_ACTUAL_ACC;
		}

		public void setW_ACTUAL_ACC(String w_ACTUAL_ACC) {
			W_ACTUAL_ACC = w_ACTUAL_ACC;
		}

		public String getW_ACC_NAME() {
			return W_ACC_NAME;
		}

		public void setW_ACC_NAME(String w_ACC_NAME) {
			W_ACC_NAME = w_ACC_NAME;
		}

		public String getW_ACTYPE_DESCN() {
			return W_ACTYPE_DESCN;
		}

		public void setW_ACTYPE_DESCN(String w_ACTYPE_DESCN) {
			W_ACTYPE_DESCN = w_ACTYPE_DESCN;
		}

		public String getW_CURR_CODE() {
			return W_CURR_CODE;
		}

		public void setW_CURR_CODE(String w_CURR_CODE) {
			W_CURR_CODE = w_CURR_CODE;
		}

		
		public String getW_PRODUCT_CODE() {
			return W_PRODUCT_CODE;
		}

		public void setW_PRODUCT_CODE(String w_PRODUCT_CODE) {
			W_PRODUCT_CODE = w_PRODUCT_CODE;
		}

		public String getW_PRODUCT_FOR_DEPOSITS() {
			return W_PRODUCT_FOR_DEPOSITS;
		}

		public void setW_PRODUCT_FOR_DEPOSITS(String w_PRODUCT_FOR_DEPOSITS) {
			W_PRODUCT_FOR_DEPOSITS = w_PRODUCT_FOR_DEPOSITS;
		}

		public String getW_PRODUCT_CONTRACT_ALLOWED() {
			return W_PRODUCT_CONTRACT_ALLOWED;
		}

		public void setW_PRODUCT_CONTRACT_ALLOWED(String w_PRODUCT_CONTRACT_ALLOWED) {
			W_PRODUCT_CONTRACT_ALLOWED = w_PRODUCT_CONTRACT_ALLOWED;
		}

		public String getW_PRODUCT_FOR_LOANS() {
			return W_PRODUCT_FOR_LOANS;
		}

		public void setW_PRODUCT_FOR_LOANS(String w_PRODUCT_FOR_LOANS) {
			W_PRODUCT_FOR_LOANS = w_PRODUCT_FOR_LOANS;
		}

		public List<Details> getDetails() {
			return details;
		}

		public void setDetails(List<Details> details) {
			this.details = details;
		}
	}*/

	public String getNO_OF_ACCOUNTS() {
		return NO_OF_ACCOUNTS;
	}

	public void setNO_OF_ACCOUNTS(String nO_OF_ACCOUNTS) {
		NO_OF_ACCOUNTS = nO_OF_ACCOUNTS;
	}

	public String getERROR() {
		return ERROR;
	}

	public void setERROR(String eRROR) {
		ERROR = eRROR;
	}

	public List<PortfolioAccounts> getAccount() {
		return account;
	}

	public void setAccount(List<PortfolioAccounts> account) {
		this.account = account;
	}

	/*
	 * public static void main(String[] args) { PortfolioSummaryResponse response1 =
	 * new PortfolioSummaryResponse(); PortfolioSummaryResponse.Account act = new
	 * PortfolioSummaryResponse.Account(); act.setW_ACC_NAME("TEST");
	 * response1.getAccount().add(act);
	 * System.out.println(response1.getAccount().size());
	 * 
	 * PortfolioSummaryResponse response2 = new PortfolioSummaryResponse();
	 * 
	 * System.out.println(response1.getAccount().size());
	 * 
	 * System.out.println(response2.getAccount().size());
	 * 
	 * response2.getAccount().add(act); response2.getAccount().add(act);
	 * response2.getAccount().add(act);
	 * 
	 * System.out.println(response1.getAccount().size());
	 * 
	 * System.out.println(response2.getAccount().size());
	 * 
	 * response2.getAccount().clear();
	 * 
	 * System.out.println(response1.getAccount().size());
	 * 
	 * System.out.println(response2.getAccount().size()); }
	 */
}
