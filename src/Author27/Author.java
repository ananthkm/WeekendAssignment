package Author27;

public class Author {
	private String name;
	private String gender;
	private String email;
	
	public Author(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Author(String name, String gender, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
	}
	
}
