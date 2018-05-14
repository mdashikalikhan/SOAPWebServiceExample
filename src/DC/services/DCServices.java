package DC.services;

import javax.jws.WebService;

import DC.services.impl.CustomerDetailsImpl;
import DC.services.impl.InvalidInputException;
import DC.services.impl.PortfolioSummaryImpl;
import DC.services.interfaces.DCServicesInterface;
import DC.services.model.CustomerDeatilsRequest;
import DC.services.model.CustomerDetailResponse;
import DC.services.model.PortfolioSummaryRequest;
import DC.services.model.PortfolioSummaryResponse;

@WebService /* (endpointInterface="DC.services.interfaces.DCServicesInterface") */
public class DCServices implements DCServicesInterface {

	@Override
	public CustomerDetailResponse getCustomerDetails(CustomerDeatilsRequest customerDetailRequest) {
		return new CustomerDetailsImpl().getCustomerDetails(customerDetailRequest);
	}

	@Override
	public PortfolioSummaryResponse getPortfolioSummary(PortfolioSummaryRequest portfolioSummaryRequest) {
		return new PortfolioSummaryImpl().getPortfolioSummary(portfolioSummaryRequest);
	}

}
