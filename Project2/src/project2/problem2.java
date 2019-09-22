package project2;

import java.util.Scanner; 

public class problem2 {
	public static void main(String args[]) 
    { 
    
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 1 to measure BMI in Imperial. Enter 2 to measure BMI in Metric: ");
		double type = scan.nextDouble();
		double weight,height,BMI;
		if(type==1) {
			System.out.print("Enter weight in pounds: ");
			weight = scan.nextDouble();
			System.out.print("Enter height in feet: ");
			height = scan.nextDouble();
			BMI = (703*weight)/(Math.pow(height,2.0));
			System.out.print("Your BMI is "+ BMI);
		}
		
		else if(type==2) {
			System.out.print("Enter weight in kilograms: ");
			weight = scan.nextDouble();
			System.out.print("Enter height in meters: ");
			height = scan.nextDouble();
			BMI = (weight)/(Math.pow(height,2.0));
			System.out.print("Your BMI is "+ BMI);
			
		}
		
		else {
			return 1;
		}
				
    } 
}

