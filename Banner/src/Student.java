import java.util.Scanner;

/**
 *Description: This project allows the user to input their gpa, student ID, and 
 * the amount of years they have attended a college.
 * @author humzasalim
 *
 */
import java.util.Scanner;
public class Student
{
	public static void main(String[] args)
	{
		double gpa;
		int numberOfYears;
		int studentId;
		
		Scanner input = new Scanner(System.in);	

		
		System.out.println("Collecting Student Data");
		
		System.out.println();
		System.out.println();
		
		System.out.print("Please enter your GPA: ");
		
		gpa = input.nextDouble();

				
		System.out.print("Please enter your student id number: ");
		
		
		studentId = input.nextInt();

				
		System.out.print("Please enter the number of years you have attended De Anza: ");
	    		

		numberOfYears = input.nextInt();
		
		input.close();

		System.out.println();
		System.out.println();

		
		System.out.println(gpa + " " + "is your GPA.");
		
		System.out.println ("Your student ID number is " + studentId + ".");
		
		System.out.println("You have attended De Anza for " + numberOfYears + " years.");

		
		
	}


}
