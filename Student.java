package org.studentdata;
import java.util.*;

public class Student {
	
	private String firstName;
	private String lastName;
	private int   passedoutYear;
	private String studentId;
	private String courses ="";
	private int feeBalance = 0;
	private static int totalFees = 30000; 
	private static int id=1000;
	
//	Consturctor user to enter Student name
	public Student() {
		
		Scanner  s  = new Scanner(System.in);
		System.out.print("Enter Student Firstname : ");
		this.firstName = s.nextLine();
		
		System.out.print("Enter Student Lastname : ");
		this.lastName = s.nextLine(); 
		
		System.out.print("1 - Fresher \n2 - Junior \n3 - Senior \n4 - Enter Passed Out year : ");
		this.passedoutYear = s.nextInt();
		setStudentId();
		System.out.println(firstName+" "+lastName+" "+passedoutYear+" "+studentId); 
		
//		Generate ID
}
		private void setStudentId() {
//		year + id
		id++;
	    this.studentId = passedoutYear+ ""+id;
		
	}
		public void enroll() {

			do {
			System.out.print("Enter Course to enroll (Q to Quit) : ");
			Scanner s1 = new Scanner(System.in);
			String course=s1.nextLine();
			if(!course.equals("Q")) {  
				courses = courses+ "\n" + course;
				feeBalance = feeBalance + totalFees; 
			}
			else {
				System.out.println("BREAK !!!");
				break;
			}
			}while(1 !=0);
			
			System.out.println("ENROLLED IN : "+ courses);
			System.out.println("Total Fees of Course : "+totalFees);
		}
		
//		balance
		public void viewBalance() {

			System.out.println("Your Balance is : $"+feeBalance);
		}
		public void payFees() {
			viewBalance();
			System.out.print("Enter Amount to Paid : ");
			Scanner s2=new Scanner(System.in);
			int payment =s2.nextInt(); 
			feeBalance = feeBalance-payment;
			System.out.println("Thank you for your Registation");
			
	
		}
		public void studentDetails() {
			System.out.println("");
			System.out.println("===============  ALL THE BEST  ==================");

			System.out.println("Student Name : "+firstName+" "+lastName);
			System.out.println("Student ID :"+studentId);
			System.out.println("Passedout Year :"+passedoutYear);
			System.out.println("Enrolled Course :"+courses);
			System.out.println("Total Fees for Course : "+totalFees);
			System.out.println("Balance Fees :"+feeBalance);
			
			System.out.println("=============== * THANK YOU *====================");
		}
		
	
}
