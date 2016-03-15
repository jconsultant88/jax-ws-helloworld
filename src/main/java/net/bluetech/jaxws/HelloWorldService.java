package net.bluetech.jaxws;

/**
 * Created by vemulav on 14/03/2016.
 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface

@WebService(serviceName = "TestService",portName = "TestPort")
@SOAPBinding(style = Style.RPC)
public interface HelloWorldService {

	@WebMethod(operationName = "getHelloMessage")
	String hello(String name);

}
