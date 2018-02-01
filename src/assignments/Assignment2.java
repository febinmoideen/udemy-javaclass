package assignments;

import java.util.List;
import java.util.ArrayList;

public class Assignment2 {
	public static void main(String args[]) {
		Student student1 = new Student("Messi", "123456789");
		System.out.println(student1.toString());
		
		System.out.println("");
		System.out.println("Account balance is: $" + student1.checkBalance());
		
		System.out.println("");
		student1.enroll("CS 101", 1000);
		System.out.println("Enrolled Course(s) are: " + student1.showCourses());
		System.out.println("Account balance is: $" + student1.checkBalance());
		
		System.out.println("");
		student1.pay(500);
		System.out.println("Account balance is: $" + student1.checkBalance());
		
		System.out.println("");
		student1.enroll("CS 210", 1300);
		System.out.println("Enrolled Course(s) are: " + student1.showCourses());
		System.out.println("Account balance is: $" + student1.checkBalance());
	}
	
}

class Student implements IAccount{
	private static int _id = 1000;
	private String _userID;
	private String _name;
	private String _ssn;
	private String _email;
	private String _phone;
	private String _city;
	private String _state;
	private double _accountBalance;
	private List<String> _courses;

	
	Student(String name, String ssn){
		_id++;
		this._name = name;
		this._ssn = ssn;
		setEmail();
		setUserID();
		_courses = new ArrayList<String>();
	}
	
	private void setEmail() {
		this._email = this._name + "@university.com";
	}
	
	private void setUserID() {
		int random = (int) (Math.random() * 10000);
		this._userID = Integer.toString(_id) + Integer.toString(random) + this._ssn.substring(5);
	}

	public String get_phone() {
		return _phone;
	}

	public void set_phone(String _phone) {
		this._phone = _phone;
	}

	public String get_city() {
		return _city;
	}

	public void set_city(String _city) {
		this._city = _city;
	}

	public String get_state() {
		return _state;
	}

	public void set_state(String _state) {
		this._state = _state;
	}
	
	@Override
	public void pay(double amount) {
		this._accountBalance -= amount;
		System.out.println("Paid off $" + amount);
	}
	
	@Override
	public double checkBalance() {
		return _accountBalance;
	}
	
	public void enroll(String course, double tuition) {
		this._courses.add(course);
		this._accountBalance += tuition;
		System.out.println("Enrolled in " + course + " costing $" + tuition);
	}
	
	public String showCourses() {
		return _courses.toString();
	}
	
	@Override
	public String toString() {
		return String.format("Name: %1$s\nEmail: %2$s\nUser ID: %3$s", this._name, this._email, this._userID);
	}
	
}

interface IAccount {
	public double checkBalance();
	public void pay(double amount);
}
