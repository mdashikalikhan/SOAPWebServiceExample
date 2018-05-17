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
