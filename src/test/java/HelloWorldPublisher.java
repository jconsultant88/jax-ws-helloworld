
import javax.xml.ws.Endpoint;

import net.bluetech.jaxws.HelloWorldServiceImpl;

/**
 * Created by vemulav on 14/03/2016.
 */
//Endpoint publisher
public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/jaxws/hello", new HelloWorldServiceImpl());
	}

}