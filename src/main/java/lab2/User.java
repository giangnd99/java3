package lab2;

public class User {

	private String fullname;
	private boolean gender;
	private String country;

	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String fullname, boolean gender, String country) {
		super();
		this.fullname = fullname;
		this.gender = gender;
		this.country = country;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
