package DC.services.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "cust_response")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "ERROR", "V_FIRST_NAME", "V_SECOND_NAME", "V_FULL_NAME", "V_MOTHER_NAME", "V_COUNTRY_CODE",
		"V_BIRTH_DATE", "V_OPEN_DATE", "V_SEX", "V_CLIENT_TYPE", "V_EMPLOY_TYPE", "V_SEGMENT_CODE", "V_BUSDIVN_CODE",
		"V_ARM_CODE", "V_BRN_CODE", "V_CUST_ADDRESS", "V_CUST_ADDR1", "V_CUST_ADDR2", "V_CUST_ADDR3", "V_CUST_ADDR4",
		"V_CUST_ADDR5", "V_COUNTRY_DESC", "V_LOCN_CODE", "V_CONTACT_NO", "V_EMAIL_ID", "V_RES_TELNO", "V_OFF_TELNO",
		"V_FAX_NO", "W_CLIENT_NAME", "W_INCORP_DATE", "W_INCORP_CNTRY", "W_REG_NUM", "W_REG_DATE", "W_REG_EXPIRY_DATE",
		"W_REG_OFF_ADDR1", "W_REG_OFF_ADDR2", "W_REG_OFF_ADDR3", "W_REG_OFF_ADDR4", "W_REG_OFF_ADDR5",
		"W_BC_GROSS_TURNOVER", "W_AUTHORIZED_CAPITAL", "W_ISSUED_CAPITAL", "W_PAIDUP_CAPITAL", "W_NETWORTH_AMT",
		"V_BRANCH_NAME", "W_NATURE_OF_BUS1", "V_PIN_CODE" })
public class CustomerDetailResponse {
	@XmlElement(name = "res_firstName")
	private String V_FIRST_NAME = "";
	@XmlElement(name = "res_lastName")
	private String V_SECOND_NAME = "";
	@XmlElement(name = "res_fullName")
	private String V_FULL_NAME = "";
	@XmlElement(name = "res_motherName")
	private String V_MOTHER_NAME = "";
	@XmlElement(name = "res_nationalityID")
	private String V_COUNTRY_CODE = "";
	@XmlElement(name = "res_birthDate")
	private String V_BIRTH_DATE = "";
	@XmlElement(name = "res_customerOpenDate")
	private String V_OPEN_DATE = "";
	@XmlElement(name = "res_gender")
	private String V_SEX = "";
	@XmlElement(name = "res_customerType")
	private String V_CLIENT_TYPE = "";
	@XmlElement(name = "StaffFlag")
	private String V_EMPLOY_TYPE = "";
	@XmlElement(name = "SegmentCode")
	private String V_SEGMENT_CODE = "";
	@XmlElement(name = "BusinessDivision")
	private String V_BUSDIVN_CODE = "";
	@XmlElement(name = "CustomerARMCode")
	private String V_ARM_CODE = "";
	@XmlElement(name = "CustomerBranch")
	private String V_BRN_CODE = "";
	@XmlElement(name = "Address")
	private String V_CUST_ADDRESS = "";
	@XmlElement(name = "Address1")
	private String V_CUST_ADDR1 = "";
	@XmlElement(name = "res_Address2")
	private String V_CUST_ADDR2 = "";
	@XmlElement(name = "res_Address3")
	private String V_CUST_ADDR3 = "";
	@XmlElement(name = "res_Address4")
	private String V_CUST_ADDR4 = "";
	@XmlElement(name = "res_Address5")
	private String V_CUST_ADDR5 = "";
	@XmlElement(name = "res_countryCode")
	private String V_COUNTRY_DESC = "";
	@XmlElement(name = "res_stateCode")
	private String V_LOCN_CODE = "";
	@XmlElement(name = "res_mobileNumber")
	private String V_CONTACT_NO = "";
	@XmlElement(name = "res_emailId")
	private String V_EMAIL_ID = "";
	@XmlElement(name = "res_residentialTelephoneNumber")
	private String V_RES_TELNO = "";
	private String V_OFF_TELNO = "";
	private String V_FAX_NO = "";
	private String W_CLIENT_NAME = "";
	private String W_INCORP_DATE = "";
	private String W_INCORP_CNTRY = "";
	private String W_REG_NUM = "";
	private String W_REG_DATE = "";
	private String W_REG_EXPIRY_DATE = "";
	private String W_REG_OFF_ADDR1 = "";
	private String W_REG_OFF_ADDR2 = "";
	private String W_REG_OFF_ADDR3 = "";
	private String W_REG_OFF_ADDR4 = "";
	private String W_REG_OFF_ADDR5 = "";
	private String W_BC_GROSS_TURNOVER = "";
	private String W_AUTHORIZED_CAPITAL = "";
	private String W_ISSUED_CAPITAL = "";
	private String W_PAIDUP_CAPITAL = "";
	private String W_NETWORTH_AMT = "";
	private String V_BRANCH_NAME = "";
	private String W_NATURE_OF_BUS1 = "";
	private String V_PIN_CODE = "";
	private String ERROR = "";

	public CustomerDetailResponse() {
	}

	public String getV_FIRST_NAME() {
		return V_FIRST_NAME;
	}

	public void setV_FIRST_NAME(String v_FIRST_NAME) {
		V_FIRST_NAME = v_FIRST_NAME;
	}

	public String getV_SECOND_NAME() {
		return V_SECOND_NAME;
	}

	public void setV_SECOND_NAME(String v_SECOND_NAME) {
		V_SECOND_NAME = v_SECOND_NAME;
	}

	public String getV_FULL_NAME() {
		return V_FULL_NAME;
	}

	public void setV_FULL_NAME(String v_FULL_NAME) {
		V_FULL_NAME = v_FULL_NAME;
	}

	public String getV_MOTHER_NAME() {
		return V_MOTHER_NAME;
	}

	public void setV_MOTHER_NAME(String v_MOTHER_NAME) {
		V_MOTHER_NAME = v_MOTHER_NAME;
	}

	public String getV_COUNTRY_CODE() {
		return V_COUNTRY_CODE;
	}

	public void setV_COUNTRY_CODE(String v_COUNTRY_CODE) {
		V_COUNTRY_CODE = v_COUNTRY_CODE;
	}

	public String getV_BIRTH_DATE() {
		return V_BIRTH_DATE;
	}

	public void setV_BIRTH_DATE(String v_BIRTH_DATE) {
		V_BIRTH_DATE = v_BIRTH_DATE;
	}

	public String getV_OPEN_DATE() {
		return V_OPEN_DATE;
	}

	public void setV_OPEN_DATE(String v_OPEN_DATE) {
		V_OPEN_DATE = v_OPEN_DATE;
	}

	public String getV_SEX() {
		return V_SEX;
	}

	public void setV_SEX(String v_SEX) {
		V_SEX = v_SEX;
	}

	public String getV_CLIENT_TYPE() {
		return V_CLIENT_TYPE;
	}

	public void setV_CLIENT_TYPE(String v_CLIENT_TYPE) {
		V_CLIENT_TYPE = v_CLIENT_TYPE;
	}

	public String getV_EMPLOY_TYPE() {
		return V_EMPLOY_TYPE;
	}

	public void setV_EMPLOY_TYPE(String v_EMPLOY_TYPE) {
		V_EMPLOY_TYPE = v_EMPLOY_TYPE;
	}

	public String getV_SEGMENT_CODE() {
		return V_SEGMENT_CODE;
	}

	public void setV_SEGMENT_CODE(String v_SEGMENT_CODE) {
		V_SEGMENT_CODE = v_SEGMENT_CODE;
	}

	public String getV_BUSDIVN_CODE() {
		return V_BUSDIVN_CODE;
	}

	public void setV_BUSDIVN_CODE(String v_BUSDIVN_CODE) {
		V_BUSDIVN_CODE = v_BUSDIVN_CODE;
	}

	public String getV_ARM_CODE() {
		return V_ARM_CODE;
	}

	public void setV_ARM_CODE(String v_ARM_CODE) {
		V_ARM_CODE = v_ARM_CODE;
	}

	public String getV_BRN_CODE() {
		return V_BRN_CODE;
	}

	public void setV_BRN_CODE(String v_BRN_CODE) {
		V_BRN_CODE = v_BRN_CODE;
	}

	public String getV_CUST_ADDRESS() {
		return V_CUST_ADDRESS;
	}

	public void setV_CUST_ADDRESS(String v_CUST_ADDRESS) {
		V_CUST_ADDRESS = v_CUST_ADDRESS;
	}

	public String getV_CUST_ADDR1() {
		return V_CUST_ADDR1;
	}

	public void setV_CUST_ADDR1(String v_CUST_ADDR1) {
		V_CUST_ADDR1 = v_CUST_ADDR1;
	}

	public String getV_CUST_ADDR2() {
		return V_CUST_ADDR2;
	}

	public void setV_CUST_ADDR2(String v_CUST_ADDR2) {
		V_CUST_ADDR2 = v_CUST_ADDR2;
	}

	public String getV_CUST_ADDR3() {
		return V_CUST_ADDR3;
	}

	public void setV_CUST_ADDR3(String v_CUST_ADDR3) {
		V_CUST_ADDR3 = v_CUST_ADDR3;
	}

	public String getV_CUST_ADDR4() {
		return V_CUST_ADDR4;
	}

	public void setV_CUST_ADDR4(String v_CUST_ADDR4) {
		V_CUST_ADDR4 = v_CUST_ADDR4;
	}

	public String getV_CUST_ADDR5() {
		return V_CUST_ADDR5;
	}

	public void setV_CUST_ADDR5(String v_CUST_ADDR5) {
		V_CUST_ADDR5 = v_CUST_ADDR5;
	}

	public String getV_COUNTRY_DESC() {
		return V_COUNTRY_DESC;
	}

	public void setV_COUNTRY_DESC(String v_COUNTRY_DESC) {
		V_COUNTRY_DESC = v_COUNTRY_DESC;
	}

	public String getV_LOCN_CODE() {
		return V_LOCN_CODE;
	}

	public void setV_LOCN_CODE(String v_LOCN_CODE) {
		V_LOCN_CODE = v_LOCN_CODE;
	}

	public String getV_CONTACT_NO() {
		return V_CONTACT_NO;
	}

	public void setV_CONTACT_NO(String v_CONTACT_NO) {
		V_CONTACT_NO = v_CONTACT_NO;
	}

	public String getV_EMAIL_ID() {
		return V_EMAIL_ID;
	}

	public void setV_EMAIL_ID(String v_EMAIL_ID) {
		V_EMAIL_ID = v_EMAIL_ID;
	}

	public String getV_RES_TELNO() {
		return V_RES_TELNO;
	}

	public void setV_RES_TELNO(String v_RES_TELNO) {
		V_RES_TELNO = v_RES_TELNO;
	}

	public String getV_OFF_TELNO() {
		return V_OFF_TELNO;
	}

	public void setV_OFF_TELNO(String v_OFF_TELNO) {
		V_OFF_TELNO = v_OFF_TELNO;
	}

	public String getV_FAX_NO() {
		return V_FAX_NO;
	}

	public void setV_FAX_NO(String v_FAX_NO) {
		V_FAX_NO = v_FAX_NO;
	}

	public String getW_CLIENT_NAME() {
		return W_CLIENT_NAME;
	}

	public void setW_CLIENT_NAME(String w_CLIENT_NAME) {
		W_CLIENT_NAME = w_CLIENT_NAME;
	}

	public String getW_INCORP_DATE() {
		return W_INCORP_DATE;
	}

	public void setW_INCORP_DATE(String w_INCORP_DATE) {
		W_INCORP_DATE = w_INCORP_DATE;
	}

	public String getW_INCORP_CNTRY() {
		return W_INCORP_CNTRY;
	}

	public void setW_INCORP_CNTRY(String w_INCORP_CNTRY) {
		W_INCORP_CNTRY = w_INCORP_CNTRY;
	}

	public String getW_REG_NUM() {
		return W_REG_NUM;
	}

	public void setW_REG_NUM(String w_REG_NUM) {
		W_REG_NUM = w_REG_NUM;
	}

	public String getW_REG_DATE() {
		return W_REG_DATE;
	}

	public void setW_REG_DATE(String w_REG_DATE) {
		W_REG_DATE = w_REG_DATE;
	}

	public String getW_REG_EXPIRY_DATE() {
		return W_REG_EXPIRY_DATE;
	}

	public void setW_REG_EXPIRY_DATE(String w_REG_EXPIRY_DATE) {
		W_REG_EXPIRY_DATE = w_REG_EXPIRY_DATE;
	}

	public String getW_REG_OFF_ADDR1() {
		return W_REG_OFF_ADDR1;
	}

	public void setW_REG_OFF_ADDR1(String w_REG_OFF_ADDR1) {
		W_REG_OFF_ADDR1 = w_REG_OFF_ADDR1;
	}

	public String getW_REG_OFF_ADDR2() {
		return W_REG_OFF_ADDR2;
	}

	public void setW_REG_OFF_ADDR2(String w_REG_OFF_ADDR2) {
		W_REG_OFF_ADDR2 = w_REG_OFF_ADDR2;
	}

	public String getW_REG_OFF_ADDR3() {
		return W_REG_OFF_ADDR3;
	}

	public void setW_REG_OFF_ADDR3(String w_REG_OFF_ADDR3) {
		W_REG_OFF_ADDR3 = w_REG_OFF_ADDR3;
	}

	public String getW_REG_OFF_ADDR4() {
		return W_REG_OFF_ADDR4;
	}

	public void setW_REG_OFF_ADDR4(String w_REG_OFF_ADDR4) {
		W_REG_OFF_ADDR4 = w_REG_OFF_ADDR4;
	}

	public String getW_REG_OFF_ADDR5() {
		return W_REG_OFF_ADDR5;
	}

	public void setW_REG_OFF_ADDR5(String w_REG_OFF_ADDR5) {
		W_REG_OFF_ADDR5 = w_REG_OFF_ADDR5;
	}

	public String getW_BC_GROSS_TURNOVER() {
		return W_BC_GROSS_TURNOVER;
	}

	public void setW_BC_GROSS_TURNOVER(String w_BC_GROSS_TURNOVER) {
		W_BC_GROSS_TURNOVER = w_BC_GROSS_TURNOVER;
	}

	public String getW_AUTHORIZED_CAPITAL() {
		return W_AUTHORIZED_CAPITAL;
	}

	public void setW_AUTHORIZED_CAPITAL(String w_AUTHORIZED_CAPITAL) {
		W_AUTHORIZED_CAPITAL = w_AUTHORIZED_CAPITAL;
	}

	public String getW_ISSUED_CAPITAL() {
		return W_ISSUED_CAPITAL;
	}

	public void setW_ISSUED_CAPITAL(String w_ISSUED_CAPITAL) {
		W_ISSUED_CAPITAL = w_ISSUED_CAPITAL;
	}

	public String getW_PAIDUP_CAPITAL() {
		return W_PAIDUP_CAPITAL;
	}

	public void setW_PAIDUP_CAPITAL(String w_PAIDUP_CAPITAL) {
		W_PAIDUP_CAPITAL = w_PAIDUP_CAPITAL;
	}

	public String getW_NETWORTH_AMT() {
		return W_NETWORTH_AMT;
	}

	public void setW_NETWORTH_AMT(String w_NETWORTH_AMT) {
		W_NETWORTH_AMT = w_NETWORTH_AMT;
	}

	public String getV_BRANCH_NAME() {
		return V_BRANCH_NAME;
	}

	public void setV_BRANCH_NAME(String v_BRANCH_NAME) {
		V_BRANCH_NAME = v_BRANCH_NAME;
	}

	public String getW_NATURE_OF_BUS1() {
		return W_NATURE_OF_BUS1;
	}

	public void setW_NATURE_OF_BUS1(String w_NATURE_OF_BUS1) {
		W_NATURE_OF_BUS1 = w_NATURE_OF_BUS1;
	}

	public String getV_PIN_CODE() {
		return V_PIN_CODE;
	}

	public void setV_PIN_CODE(String v_PIN_CODE) {
		V_PIN_CODE = v_PIN_CODE;
	}

	public String getERROR() {
		return ERROR;
	}

	public void setERROR(String eRROR) {
		ERROR = eRROR;
	}

	@Override
	public String toString() {
		return "CustomerDetailResponse [V_FIRST_NAME=" + V_FIRST_NAME + ", V_SECOND_NAME=" + V_SECOND_NAME
				+ ", V_FULL_NAME=" + V_FULL_NAME + ", V_MOTHER_NAME=" + V_MOTHER_NAME + ", V_COUNTRY_CODE="
				+ V_COUNTRY_CODE + ", V_BIRTH_DATE=" + V_BIRTH_DATE + ", V_OPEN_DATE=" + V_OPEN_DATE + ", V_SEX="
				+ V_SEX + ", V_CLIENT_TYPE=" + V_CLIENT_TYPE + ", V_EMPLOY_TYPE=" + V_EMPLOY_TYPE + ", V_SEGMENT_CODE="
				+ V_SEGMENT_CODE + ", V_BUSDIVN_CODE=" + V_BUSDIVN_CODE + ", V_ARM_CODE=" + V_ARM_CODE + ", V_BRN_CODE="
				+ V_BRN_CODE + ", V_CUST_ADDRESS=" + V_CUST_ADDRESS + ", V_LOCN_CODE=" + V_LOCN_CODE + ", V_CONTACT_NO="
				+ V_CONTACT_NO + ", V_EMAIL_ID=" + V_EMAIL_ID + ", V_RES_TELNO=" + V_RES_TELNO + ", V_OFF_TELNO="
				+ V_OFF_TELNO + ", V_FAX_NO=" + V_FAX_NO + ", W_CLIENT_NAME=" + W_CLIENT_NAME + ", W_INCORP_DATE="
				+ W_INCORP_DATE + ", W_INCORP_CNTRY=" + W_INCORP_CNTRY + ", W_REG_NUM=" + W_REG_NUM + ", W_REG_DATE="
				+ W_REG_DATE + ", W_REG_EXPIRY_DATE=" + W_REG_EXPIRY_DATE + ", W_REG_OFF_ADDR1=" + W_REG_OFF_ADDR1
				+ ", W_REG_OFF_ADDR2=" + W_REG_OFF_ADDR2 + ", W_REG_OFF_ADDR3=" + W_REG_OFF_ADDR3 + ", W_REG_OFF_ADDR4="
				+ W_REG_OFF_ADDR4 + ", W_REG_OFF_ADDR5=" + W_REG_OFF_ADDR5 + ", W_BC_GROSS_TURNOVER="
				+ W_BC_GROSS_TURNOVER + ", W_AUTHORIZED_CAPITAL=" + W_AUTHORIZED_CAPITAL + ", W_ISSUED_CAPITAL="
				+ W_ISSUED_CAPITAL + ", W_PAIDUP_CAPITAL=" + W_PAIDUP_CAPITAL + ", W_NETWORTH_AMT=" + W_NETWORTH_AMT
				+ ", V_BRANCH_NAME=" + V_BRANCH_NAME + ", W_NATURE_OF_BUS1=" + W_NATURE_OF_BUS1 + ", V_PIN_CODE="
				+ V_PIN_CODE + ", ERROR=" + ERROR + "]";
	}

}
