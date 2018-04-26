package DC.services.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="cust_request", propOrder= {"cif"})
public class CustomerDeatilsRequest {
	
	private Integer cif;
	
	
	
	public CustomerDeatilsRequest() {

	}

	@XmlElement(name="CIF_NUM",required=true, nillable=false)
	public Integer getCif() {
		return cif;
	}

	public void setCif(Integer cif) {
		this.cif = cif;
	}

	
	

}
