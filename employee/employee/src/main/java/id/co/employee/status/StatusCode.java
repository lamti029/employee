package id.co.employee.status;

public class StatusCode {
	String statusCode;

	String Description;
	
	public StatusCode (){
	}

	public StatusCode (String statusCode, String description){
		this.statusCode= statusCode;
		this.Description = description;
	}
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
