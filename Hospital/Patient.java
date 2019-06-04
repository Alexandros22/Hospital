package Hospital;

public class Patient
{
	private String name;
	private String lastname;
	private String sex;
	private int age;
	private String docname;
	
	public Patient(String name, String last, String sex, int age, String docname)  // constructor of patients //
	{
		this.name=name;
		this.lastname=last;
		this.sex=sex;
		this.age=age;
		this.docname = docname;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getSex() {
		return sex;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getAge() {
		return age;
	}
	
	public void setDocname(String docname) {
		this.docname = docname;
	}


	public String getDocname() {
		return docname;
	}


	public void print()  // print function //
	{
		System.out.println("\nPatient's name:" + this.getName() + "\nPatient's lastname:" + this.getLastname() + "\nPatient's sex:" + this.getSex() + "\nPatient's age:" + this.getAge());
	}
	
}

