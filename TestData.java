import java.util.Scanner;

public class TestData {
	public static void main(String args []) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double firstNumber = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		double secondNumber = input.nextDouble();
		
		System.out.println("Enter the third number: ");
		double thirdNumber = input.nextDouble();
		
		if(firstNumber < secondNumber && firstNumber < thirdNumber)
			System.out.println("The smallest number is : " + firstNumber);
         else if(secondNumber < firstNumber && secondNumber < thirdNumber)
         System.out.println("The smallest number is : " + secondNumber);
         else
         System.out.println("The smallest number is : " + thirdNumber);

			
	}
}