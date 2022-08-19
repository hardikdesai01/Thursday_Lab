public class Account {
	int accountNumber = 111203;
	String name = "Adarsh";
	String email = "@gmail.com";

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	void display() {
		System.out.println(this.accountNumber + "  " + this.name + " " + this.email);
	}

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setAccountNumber(111);
		obj.setName("Adarsh");
		obj.setEmail("@adarsh111");
		obj.display();
	}
}