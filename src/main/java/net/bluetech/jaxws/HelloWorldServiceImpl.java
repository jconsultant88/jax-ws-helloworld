package net.bluetech.jaxws;

import javax.jws.WebService;

/**
 * Created by vemulav on 14/03/2016.
 */
@WebService(endpointInterface = "net.bluetech.jaxws.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	public String hello(String name) {
		return "Hello World JAX-WS " + name;
	}
}
