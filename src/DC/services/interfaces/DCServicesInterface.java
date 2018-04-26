package DC.services.interfaces;


import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import DC.services.Validation.ValidationInterceptor;
import DC.services.impl.InvalidInputException;
import DC.services.model.CustomerDeatilsRequest;
import DC.services.model.CustomerDetailResponse;


@WebService/*(name="DeliveryChannel", portName="DeliveryChannelPort", serviceName="DeliveryChannelWS",
targetNamespace="http://www.deliverychannel.com")*/
/*@Interceptors(value=ValidationInterceptor.class)*/
public interface DCServicesInterface {
	@WebMethod(action="process_details", operationName="getCustDetails")
	@WebResult(name="cust_response")
	public CustomerDetailResponse getCustomerDetails(@WebParam(name="cust_request") CustomerDeatilsRequest customerDetailRequest) ;
}
