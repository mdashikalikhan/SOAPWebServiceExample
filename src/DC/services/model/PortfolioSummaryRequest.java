package DC.services.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PortfolioSummaryRequest", propOrder="cif")
public class PortfolioSummaryRequest {
	private Integer cif;

	public PortfolioSummaryRequest() {
	}
	
	@XmlElement(name="CIF_NUM", required=true, nillable=false)
	public Integer getCif() {
		return cif;
	}

	public void setCif(Integer cif) {
		this.cif = cif;
	}
	
	
	
	
}
