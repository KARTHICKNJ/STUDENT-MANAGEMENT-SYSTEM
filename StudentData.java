package org.studentdata;
import java.util.*;

public class StudentData {
	
	public static void main(String[] args) {
		
		System.out.print("Enter number of Enrolled Student : ");
		Scanner s1=new Scanner(System.in);
		int std1 =s1.nextInt();
		Student[] stud = new Student[std1];
		
		for(int n=0;n<std1;n++) {
			stud[n] = new Student();
			stud[n].enroll();
			stud[n].payFees();
			stud[n].viewBalance();
			stud[n].studentDetails();
		}
		

		
	}
	
	
	
	
	
	

}
