package DC.services.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "details")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "W_ACT_ACCNUM", "W_LOAN_ACCOUNT", "VAR_AVAILABLE_BAL", "W_LOAN_AMOUNT", "W_PRINCIPAL_DEPOSIT" })
public class PortfolioDetails {
	@XmlElement(name = "account")
	private String W_ACT_ACCNUM;
	@XmlElement(name = "loan_account")
	private String W_LOAN_ACCOUNT;
	@XmlElement(name = "available_balance")
	private String VAR_AVAILABLE_BAL;
	@XmlElement(name = "os_amt")
	private String W_LOAN_AMOUNT;
	@XmlElement(name = "principal_deposit")
	private String W_PRINCIPAL_DEPOSIT;

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

	public String getW_LOAN_ACCOUNT() {
		return W_LOAN_ACCOUNT;
	}

	public void setW_LOAN_ACCOUNT(String w_LOAN_ACCOUNT) {
		W_LOAN_ACCOUNT = w_LOAN_ACCOUNT;
	}

	public String getW_LOAN_AMOUNT() {
		return W_LOAN_AMOUNT;
	}

	public void setW_LOAN_AMOUNT(String w_LOAN_AMOUNT) {
		W_LOAN_AMOUNT = w_LOAN_AMOUNT;
	}

	public String getW_PRINCIPAL_DEPOSIT() {
		return W_PRINCIPAL_DEPOSIT;
	}

	public void setW_PRINCIPAL_DEPOSIT(String w_PRINCIPAL_DEPOSIT) {
		W_PRINCIPAL_DEPOSIT = w_PRINCIPAL_DEPOSIT;
	}

}
