package Hospital;

public class Doctor
{
	private String name;
	private String lastname;
	private String specialty;
	private int pat_num;
	
	
	public Doctor (String name, String last, String spec) // constructor of doctors //
	{
		this.name=name;
		this.lastname=last;
		this.setSpecialty(spec);
		pat_num = 0;
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
	
	public void setPat_num(int pat_num) {
		this.pat_num = pat_num;
	}

	public int getPat_num() 
	{
		return pat_num;
	}
	public void incPat_num() // function which increases the number of patients of the doctor //
	{
		pat_num++;
	}

	public void print()  // print function //
	{
		System.out.println("\nDoctor's name:" + this.getName() + "\nDoctor's lastname:" + this.getLastname() + "\nDoctor's speciality:" + this.getSpecialty());
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
}
	



