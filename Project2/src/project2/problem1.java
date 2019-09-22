package project2;

import java.util.Scanner; 

public class problem1 {
	public static void main(String args[]) 
    { 
    
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
			int bit0 = data%10;
			int bit1 = (data%100) / 10;
			int bit2 = (data%1000) / 100;
			int bit3 = data / 1000;
			
			bit0=(bit0+7)%10;
			bit1=(bit1+7)%10;
			bit2=(bit2+7)%10;
			bit3=(bit3+7)%10;
			
			System.out.print(bit3+""+bit2+""+bit1+""+bit0);
		
		
    } 
}
