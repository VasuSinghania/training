import java.util.Random;

public class studentDatabase {
	
	private String first;
	private String last;
	private int SSN;
	private String email;
	private String iD;
	private int[] classes;
	private double bal;
	private String phone;
	private String location;
	
	public studentDatabase(String first, String family, int SSN) {
		this.first = first;
		this.last = family;
		this.SSN = SSN;
		this.email = email();
		this.iD = newId();
		this.bal = 0.00;
		
	}
	
	private String email() {
		String a = this.first.substring(0, 1);
		String b = this.last;
		if (this.last.length() > 5) {
			b = this.last.substring(0, 4);
		}
		return a + b + "@email.com";
	}
	
	private String newId() {
		Random rand = new Random();
		int random = rand.nextInt(9000) + 1000;
		int temp = this.SSN - this.SSN/1000;
		return "15" + "-" + random + "-" + temp;
	}
	
	public void enroll(int classNumber) {
		int[] temp = new int[this.classes.length+1];
		temp[temp.length-1] = classNumber;
		this.classes = temp;
	}
	
	public void pay(double amount) {
		this.bal += amount;
	}
	
	public double checkBal() {
		return this.bal;
	}
	
	public int[] checkCourse() {
		return this.classes;
	}
	
	public void addPhone(String areaCode, String remain) {
		this.phone = areaCode + remain;
	}
	
	public void setHome(String city, String state) {
		this.location = city+ ", " + state;
	}
	
	public String getPhoneNumber() {
		return this.phone;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	
}
