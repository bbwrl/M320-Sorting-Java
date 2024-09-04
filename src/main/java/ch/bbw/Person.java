package ch.bbw;

public class Person {

	private int age;
	private String name;
	private String city;
	private String jobTitle;

	// Konstruktor mit den neuen Attributen city und jobTitle
	public Person(int age, String name, String city, String jobTitle) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
		this.jobTitle = jobTitle;
	}

	// Getter und Setter für age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter und Setter für name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter und Setter für city
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// Getter und Setter für jobTitle
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// toString-Methode, um die Person als String auszugeben
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + ", jobTitle=" + jobTitle + "]";
	}
}
