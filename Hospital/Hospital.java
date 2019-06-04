package Hospital;

import java.util.Vector;

public class Hospital
{
	private String name;
	private String address;
	private String phone_num;
	private int num_of_beds;
	private Vector<Doctor> docs = new Vector<Doctor>();    // vector where saved the doctors //
	private Vector<Patient> asths = new Vector<Patient>();  // vector where saved the patients //
	
	
	public Hospital (String name, String add, String phn, int nobs)   // constructor of hospitals //
	{
		this.name = name;
		this.address = add;
		this.phone_num = phn;
		this.num_of_beds = nobs;
	}
	


	public void setNum_of_beds(int num_of_beds) {
		this.num_of_beds = num_of_beds;
	}



	public int getNum_of_beds() {
		return num_of_beds;
	}



	public void setPhone_num(String phn) {
		this.phone_num = phn;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void print()   // print function //
	{
		System.out.println("\nHospital name:" + this.getName() + "\nHospital address:" + this.getAddress() + "\nHospital phone:" + this.getPhone_num() + "\nHospital number of beds:" + this.getNum_of_beds());
	}
	public void insertDoc(Doctor giat)  // function which inserts doctor (element) in vector of doctors //
	{
		docs.addElement(giat);
	}
	
	public void insertAsthn(Patient asth) // function which inserts patient (element) in vector of patients //
	{
		asths.addElement(asth);
	}
	
	public Vector<Doctor> getVectorD()  // function which allow the manage of vector of the doctors from other class //
	{
		return docs;
	}
	public Vector<Patient> getVectorP()  // function which allow the manage of vector of the patients from other class //
	{
		return asths;
	}

}
