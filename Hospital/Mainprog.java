package Hospital;

import tuc.ece.cs111.util.StandardInputRead;

public class Mainprog 
{

	static StandardInputRead sir = new StandardInputRead();
	
	
	public static void main(String[] args) 
	{
			Hospital hosp;  // input hospital //

			
			String hospname=sir.readString("Give the name of the Hospital:");
			String hospadd=sir.readString("Give the address of the Hospital:");
			String hospphn=sir.readString("Give the phone of the Hospital:");
			int hospnobs=sir.readPositiveInt("Give the number of beds of the Hospital:");
			hosp=new Hospital(hospname, hospadd, hospphn, hospnobs);
			
			while (true)  // repeat of menu //
			{                                           // menu //
				int a=sir.readPositiveInt("\n\nMain Menu\n1. Insert doctor\n2. Insert patient\n3. print hospital\n4. print patients\n5. print doctors\n6. Exit\n\nPlease give your selection (1-6):");
				
				switch (a)
				{
				
				case 1:
				{
					insG(hosp);                 // input doctor //
					break;
				}
				case 2:
				{
					insP(hosp);                  // input patient //
					break;
				}
				case 3:                         // print hospital //
				{
					hosp.print();
					break;
				}
				case 4:                         // print patient //
				{
					if (hosp.getVectorP().isEmpty())
					{
						System.out.println("\nThe Hospital has no patients!");
						break;
					}
					for(int i=0; i<hosp.getVectorP().size(); i++)
					{
						hosp.getVectorP().elementAt(i).print();
					}
					break;
				}
				case 5:                        // print doctors //
				{
					if (hosp.getVectorD().isEmpty())
					{
						System.out.println("\nThe Hospital has no doctors!");
						break;
					}
					for(int i=0; i<hosp.getVectorD().size(); i++)
					{
						hosp.getVectorD().elementAt(i).print();
					}
					break;
				}
				case 6:                         // exit program //
				{
					System.exit(0);
				}
				default:                       // check of the choice //
				{
					System.out.println("\n\n!!Give one of the valid choices!!\n\n");
					break;
				}
					
				}
			}
			

	}
	
	public static void insG (Hospital hosp)   // insert doctor function //
	{
		String name,surn,spec;
		name = sir.readString("\nGive the doctor's name :");
		surn = sir.readString("Give the doctor's surname :");
		spec = sir.readString("Give the doctor's speciality :");
		Doctor temp = new Doctor(name,surn,spec);
		hosp.insertDoc(temp);                   // input doctor in vector of doctors //
	}
	
	public static void insP (Hospital hosp)  // insert patient function //
	{
		int a=0, b=0;
		String sex;
		String name=sir.readString("\nGive the patient's name :");
		String last=sir.readString("Give the patient's surname :");
		do
		{
			sex=sir.readString("Give the patient's sex :");
			if (!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female"))
			{
				System.out.println("Patients are male or female!!");
			}
		}while(!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female"));    // check the genre of patient //
		int age=sir.readPositiveInt("Give the patient's age :");
		String docsname=sir.readString("Give the patient's doctor surname :");
		
		for(int i=0; i<hosp.getVectorD().size(); i++)             // access the vector of doctors //
		{
			if(docsname.equalsIgnoreCase(hosp.getVectorD().elementAt(i).getLastname()))  // check that doctor exists //
			{
				a=1;
			}
			if(hosp.getVectorD().elementAt(i).getPat_num()<3)       // check the doctor's number of patient //
			{
				b=1;
			}                                                  // input patient if he complies with the requirements of insertion of hospital //
			if (docsname.equalsIgnoreCase(hosp.getVectorD().elementAt(i).getLastname())&& hosp.getVectorD().elementAt(i).getPat_num()<3 && hosp.getNum_of_beds()>hosp.getVectorP().size())
			{
				Patient temp=new Patient(name, last, sex, age, docsname);
				hosp.insertAsthn(temp);                      // input patient in vector of patients //
				hosp.getVectorD().elementAt(i).incPat_num();  // increase the number of patients of doctor // 
				return;
			}
		}
		
		if(a==0)           // proper message if there is no doctor //
		{
			System.out.println("\nPatient's doctor could not be found so patient was not imported!\n");
			return;
		}
		else if (b==0)     // proper message if the doctor has 3 patients //
		{
			System.out.println("\nPatient's doctor was fully occupied so patient was not imported!\n");
			return;
		}
		else if (hosp.getNum_of_beds()<=hosp.getVectorP().size())      // proper message if there is no bed at hospital //
		{
			System.out.println("\nHospital is full so patient was not imported!\n");
			return;
		}
		
	}

}
