
import java.util.Scanner;
public class MealClass {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base meal cost: ");
		
		int mealCost = input.nextInt();
		
		System.out.print("Enter the percentage tip: ");
		
		double percentageTip = input.nextDouble();
		
		System.out.print("Enter the percentage tax: ");
		
		double percentageTax = input.nextDouble();
		
		double totalMealCost = (percentageTax/100 * mealCost) + (percentageTip/100 * mealCost) + mealCost;
		
		System.out.print("The total meal cost is " + totalMealCost + ".");
	
	}

}
