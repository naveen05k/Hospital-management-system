package com.Hospitalinfo;
import java.sql.Date;
import java.util.*;

public class Information {
	Scanner sc = new Scanner(System.in);
	List<String>arrayliList =  new LinkedList<String>();
	
	long currentTimeMillis = System.currentTimeMillis();
	Date date = new Date(currentTimeMillis);
	public void info() {
		Hospitalinfo hp = new Hospitalinfo();
		System.out.println("Enter the patient name");
		hp.setPatientName(sc.next());
		System.out.println("Enter the patient Serial no");
		hp.setPatientSerialno(sc.next());
		System.out.println("Enter the Contact no ");
		hp.setContactNo(sc.next());
		System.out.println("Enter the Blood group");
		hp.setBlood(sc.next());
		arrayliList.add(hp.getPatientName()+"  "+hp.getPatientSerialno()+"  "+hp.getContactNo()+"  "+hp.getBlood()+"  " +date);
	}
	
	public void display() {
		System.out.println("*****THE PATIENTS DETAILS*******");

		int count = 1;
		if(arrayliList.isEmpty() == false) {

			for(int i=0;i<arrayliList.size();i++) {
				String str = arrayliList.get(i);
				String[] sd = str.split("  " );
				System.out.println("THE PATIENT NO      : "+count);
				System.out.println("1.Patient name      : " +sd[0]);
				System.out.println("2.Patient Serial No : " +sd[1]);
				System.out.println("3.Contact Number    : " +sd[2]);
				System.out.println("4.Blood Group       : " +sd[3]);
				System.out.println("5.Date              : " +sd[4]);
				System.out.println("-----------------------------------");
				count++;
			}
		}else{
			System.out.println("\nNo Data Found !!\n");
		}
	}

	public void SearchByserialno() {
		System.out.println("Enter Serial No : ");
		String Serialno = sc.next();
		for (int i= 0; i < arrayliList.size(); i++) {
			String string = arrayliList.get(i);
			String[] split = string.split("  ");
			if(split[1].equals(Serialno)) {
				System.out.println("Patient Name           : "+split[0]);
				System.out.println("Patient Serial no      : "+split[1]);
				System.out.println("Patient Contact number : "+split[2]);
				System.out.println("4.Blood Group          : " +split[3]);
			}
			else {
				System.out.println("Enter correct Serial number");
			}

		}
	}
	
	public void Removebyserialno() {
		System.out.println("Enter the serial no");
		String Serialno = sc.next();
		int count = 0;
		for (int i = 0; i < arrayliList.size(); i++) {
			String string = arrayliList.get(i);
			String[] split = string.split("  ");
			if(split[1].equals(Serialno)) {
				arrayliList.remove(i);	
				System.out.println(Serialno + "This Data Deleted Success!!");
				count ++;
			}
		}
	}
}
