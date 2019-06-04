# Hospital
A program in Java that manages the hospital patients and doctors.

This is a Java program that i made for my Java courses in university. The project contains two packages:
1) Hospital
2) tuc

To run the program you will need an Eclipse IDE (or other IDE that supports Java projects) 
or to have installed in your machine a Java SE Development Kit (or JDK for short, and SE means Standard Edition)
and the directory exists in your Path system environment variable to enable Java command in PowerShell.

## Run it from PowerShell:
change directory to folder Hospital. 

### Step 1

Then build the project with the command:
javac .\Hospital\Mainprog.java

### Step 2
Then run the project with the command:
java Hospital.Mainprog


## If you run it from Eclipse IDE:
Put the folder Hospital into your workspace and then in Eclipse go to File>Import, in the pop-up
go to General>ExistingProjects into Workspace, press next, tick "Select root directory" and browse 
to your wospace, you will able to see the Hospital in the Projects below and click "Finish".
Then run the Mainprog.java because that contain the main function.

## Program Runs

When the program runs first you have to insert the Hospital's info: 

1) Name of hospital.
2) Address of hospital.
3) Phone of hospital.
4) Number of beds.

After you will see a menu with options: 
1) Insert doctor
2) Insert patient
3) Print hospital
4) Print patients
5) Print doctors
6) Exit.