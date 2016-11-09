import org.springframework.web.client.RestTemplate;
public class RestClient {

	public static void main(String args[]){
		
		

	    final String uri = "http://localhost:8083/webservice/webapi/myresource";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}
	
	
	
	
	
}
