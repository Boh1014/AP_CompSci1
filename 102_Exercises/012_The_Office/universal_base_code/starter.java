/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Dwight.employeeToString();
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Jim.employeeToString();
		Employee Pam = new Employee(2011,"Pam","Beesly",2250);
		Pam.employeeToString();
		Employee Sam = new Employee(2011,"Sam","Ham",3000);
		Sam.employeeToString();
		michael.raiseSalary(5);
		Dwight.raiseSalary(10);
		Jim.raiseSalary(10);
		Pam.raiseSalary(50);
		Sam.raiseSalary(15);
		System.out.println(michael.getAnnualSalary());
		System.out.println(Dwight.getAnnualSalary());
		System.out.println(Jim.getAnnualSalary());
		System.out.println(Pam.getAnnualSalary());
		System.out.println(Sam.getAnnualSalary());
		
		
		
	}
}
