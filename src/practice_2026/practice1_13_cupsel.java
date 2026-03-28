package practice_2026;

public class practice1_13_cupsel {
	private String lastname;
	private String firstname;
	
	practice1_13_cupsel(String lastname, String firstname){
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public String getLastname() {
	return this.lastname;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
