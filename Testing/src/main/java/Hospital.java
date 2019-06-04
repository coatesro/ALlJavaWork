import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Hashmap;
import java.util.List;
import java.util.Scanner;


public class Hospital {


	
//	public String staff() {

	public String showInfo(String list) {

		ArrayList<String> doctor = new ArrayList<String>();
		Doctor doctors = new Doctor("John Jones", 0, "consultant", 3, false, 0);
		Doctor doctors1 = new Doctor("Jo smith", 1, "consultant", 3, false, 3);
		Doctor doctors2 = new Doctor("James bowen", 2, "Junior", 1, false, 3);
		Doctor doctors3 = new Doctor("Janet cowley", 3, "consultant", 3, false, 1);
		Doctor doctors4 = new Doctor("paul pizza", 4, "consultant", 3, false, 2);
		Doctor doctors5 = new Doctor("arnold kelp", 5, "consultant", 3, false, 1);
		
		String doctorInfo = "Name:" + doctors.getName() +"  ID:" + doctors.getDId() +"  Type:" + doctors.getType() +"  Grade:" + doctors.getGrade() +"  Team:" + doctors.getTeam()+ "Part of a team" + doctors.getPartOfTeam();
		String doctorInfo1 = "Name:" + doctors1.getName() +"  ID:" + doctors1.getDId() +"  Type:" + doctors1.getType() +"  Grade:" + doctors1.getGrade() +"  Team:" + doctors1.getTeam()+ "Part of a team" + doctors1.getPartOfTeam();
		String doctorInfo2 = "Name:" + doctors2.getName() +"  ID:" + doctors2.getDId() +"  Type:" + doctors2.getType() +"  Grade:" + doctors2.getGrade() +"  Team:" + doctors2.getTeam()+"Part of a team" + doctors2.getPartOfTeam();
		String doctorInfo3 = "Name:" + doctors3.getName() +"  ID:" + doctors3.getDId() +"  Type:" + doctors3.getType() +"  Grade:" + doctors3.getGrade() +"  Team:" + doctors3.getTeam()+"Part of a team" + doctors3.getPartOfTeam();
		String doctorInfo4 = "Name:" + doctors4.getName() +"  ID:" + doctors4.getDId() +"  Type:" + doctors4.getType() +"  Grade:" + doctors4.getGrade() +"  Team:" + doctors4.getTeam()+"Part of a team" + doctors4.getPartOfTeam();
		String doctorInfo5 = "Name:" + doctors5.getName() +"  ID:" + doctors5.getDId() +"  Type:" + doctors5.getType() +"  Grade:" + doctors5.getGrade() +"  Team:" + doctors5.getTeam()+"Part of a team" + doctors5.getPartOfTeam();

		doctor.add(doctorInfo);
		doctor.add(doctorInfo1);
		doctor.add(doctorInfo2);
		doctor.add(doctorInfo3);
		doctor.add(doctorInfo4);
		doctor.add(doctorInfo5);
		
		ArrayList<String> patient = new ArrayList<String>();
		for (int i = 0; i < patient.size(); i++) {
			
		}
				
				
		Patients patient1 = new Patients("mike joy", 0, 1, 3);
		Patients patient2 = new Patients("bob simpson", 1, 1, 3);
		Patients patient3 = new Patients("ned flanders", 2, 2, 3);
		Patients patient4 = new Patients("ben grey", 3, 3, 3);
		Patients patient5 = new Patients("suzan boyle", 4, 4, 3);
		

		System.out.println("What would you like to do?");		
		String option = input();
		if(option.equals("info")) {
			System.out.println("would you like the info for (doctors / patients / teams)");
			String i = input();	
			
			if(i.equals("doctors")){
				for(int l = 0; l < doctor.size(); l++) {
					list = "doctor information displayed";
					System.out.println(doctor.get(l));
				}
			}
				else {
					list = "doctor information error";
				}
				
			if (i.equals("patients")) {
				for(int l = 0; l < patient.size(); l++) {
					list = "patient information displayed";
					System.out.println(patient.get(l));
				}
			}
			}	
		return list;
		
}


	public String admitPatients(String patientAdmission) {
		System.out.println("What would you like to do?");		
		String s = input();
		
		if(s.equals("admit")) {
			System.out.println("enter the first name of Patient you are admitting.");
			String a = input();
			System.out.println("enter the second name of the patient.");
			String b = input();
			String c = (a + " " + b);
			System.out.println(c);
			String output = c;
			if (output == c) {
				 patientAdmission ="patient admitted";
			}
			else {
				 patientAdmission = "admisson failure";
			}
		}
		return patientAdmission;
		
	}
//	for the above method create an array list that allows the user to add the entered name into the arraylist.
	public String createTeam(String dId ) {
		System.out.println("What would you like to do?");		
		String s = input();
		
		if(s.equals("create team")) {
			System.out.println("which doctor would you like to add");
			String a = input();
			String output = "";
//			if(a.equals(doctor.name && a.equals(doctor.team(false))){
//				output = "this doctor has been added to team";
//			}
//			else {
//			output = "team creation error";
//			}
		}
		return null;
	}
// for the above method create a way to check the Doctor class and check that the name exists in the doctor name array list and that the team is set to false.
	public String treatPatients() {
		
		return null;
		
	}
	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
}
////	the above method just allows to manipulate the input.
}

