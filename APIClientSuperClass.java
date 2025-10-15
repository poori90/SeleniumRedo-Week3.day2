package week3.day2;

public class APIClientSuperClass {

	public void sendRequest(String endpoint) {
		System.out.println("The send Request is : " + endpoint);

	}
	public void sendRequest(String endpoint , String requestBody,boolean requestStatus) {
		
		System.out.println("Send Request method contains End Point , Request Body and RequestStatus Arguments : " + endpoint + " " + requestBody + " "+  requestStatus );
	}
	public static void main(String[] args) {
		
		APIClientSuperClass api = new APIClientSuperClass();
		api.sendRequest("HTTPProtocol");
		api.sendRequest("TCCPProtocol", "JSONMessage", true);

	}

}
