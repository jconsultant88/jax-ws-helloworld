/**
 * Created by vemulav on 14/03/2016.
 */

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import net.bluetech.jaxws.HelloWorldService;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:8080/jaxws/hello?wsdl");

		//1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://jaxws.bluetech.net/" , "HelloWorldServiceImplService");

		Service service = Service.create(url, qname);

		HelloWorldService helloWorldService = service.getPort(HelloWorldService.class);

		System.out.println(helloWorldService.hello("Test"));

	}

}
