import org.springframework.web.client.RestTemplate;

public class ParamClient {

	
public static void main(String args[]){
		
		

	    final String uri = "http://localhost:8083/webservice/webapi/param/customer/20";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}
	
	
}
