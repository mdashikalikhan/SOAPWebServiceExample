package DC.services.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "W_ACTUAL_ACC", "W_ACC_NAME", "W_ACTYPE_DESCN", "W_PRODUCT_CODE", "W_CURR_CODE",
		"W_PRODUCT_FOR_DEPOSITS", "W_PRODUCT_CONTRACT_ALLOWED", "W_PRODUCT_FOR_LOANS", "details" })
public class PortfolioAccounts {
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
	private List<PortfolioDetails> details;
	
	public PortfolioAccounts() {
		details = new ArrayList<PortfolioDetails>();
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

	public List<PortfolioDetails> getDetails() {
		return details;
	}

	public void setDetails(List<PortfolioDetails> details) {
		this.details = details;
	}
}
