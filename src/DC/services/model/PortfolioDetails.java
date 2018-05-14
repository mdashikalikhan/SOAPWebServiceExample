package DC.services.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "details")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder= {"W_ACT_ACCNUM", "VAR_AVAILABLE_BAL"})
public class PortfolioDetails {
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
