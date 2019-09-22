package project2;
import java.util.Scanner; 

public class problem3 {
	public static void main(String args[]) {
		
	Scanner scan = new Scanner(System.in);
	char[]topics = new char [5];
	int[][]responses = new int [5][10];
	int i,j;
	int rank = 0;
	int menu = 1;
	
	
	while(menu!=0) {
		System.out.println("Enter 1 to take survey");
		System.out.println("Enter 2 to show average ");
		System.out.println("Enter 3 to show issue with highest point total");
		System.out.println("Enter 4 to show issue with lowest point total");
		System.out.println("Enter 0 to exit");
		System.out.println("\nEnter your choice: ");
		menu = scan.nextInt();

	
		if(menu==1)
		{
			for(i = 1; i<=5;i++) { //I'm lazy so I'm just making up a bs political survey
				if(i==1)
				{
					System.out.print("\nOn a scale of one to ten, how is Trump doing: ");
					rank = scan.nextInt();
				}
		
				else if(i==2){
					System.out.print("\nOn a scale of one to ten, how did Obama do: ");
					rank = scan.nextInt();
				}
				else if(i==3){
					System.out.print("\nOn a scale of one to ten, how much do you trust the media: ");
					rank = scan.nextInt();
				}
				else if(i==4){
					System.out.print("\nOn a scale of one to ten, how frequently do you encounter fake news: ");
					rank = scan.nextInt();
				}
			
				else if(i==5){
					System.out.print("\nOn a scale of one to ten, how racist do you think America is: ");
					rank = scan.nextInt();
				}
			
				responses[i-1][rank-1] += 1; 
				
		
			}
						
		}
		
		else if(menu==2)
		{
			
			for(i=1;i<=5;i++) 
			{
				int counter = 0;
				int total = 0;
				int average = 0;
				
				for(j=1;j<=10;j++) 
				{
				
					if(responses[i-1][j-1]!=0) {
						total=total+j;
						counter++;
					}
				
				}	
				
				if(counter!=0) {
					average = total / counter;
					System.out.println("The average rating for question "+i+" is "+average+".");
				}
					
				else {
					System.out.println("The average rating for question "+i+" is 0");
				}
				
				
			}
			
			
		}
		
		
		
		else if(menu==3){
			
			int total1=0;
			int total2=0;
			int total3=0;
			int total4=0;
			int total5=0;
				
			for(j=0;j<10;j++) 
			{
				total1 = total1 + (j+1)*responses[0][j];
				total2 = total2 + (j+1)*responses[1][j];
				total3 = total3 + (j+1)*responses[2][j];
				total4 = total4 + (j+1)*responses[3][j];
				total5 = total5 + (j+1)*responses[4][j];							
			}
				int max = total1;
				
				if(total2>max) {
					max=total2;
				}
				if(total2>max) {
					max=total3;
				}
				if(total4>max) {
					max=total4;
				}
				if(total5>max) {
					max=total5;
				}
				
				//
				if(total1==max) {
					System.out.println("The highest rated question is question 1 and has a total score of "+max);
				}
				if(total2==max) {
					System.out.println("The highest rated question is question 2 and has a total score of "+max);
				}
				if(total3==max) {
					System.out.println("The highest rated question is question 3 and has a total score of "+max);
				}
				if(total4==max) {
					System.out.println("The highest rated question is question 4 and has a total score of "+max);
				}
				if(total5==max) {
					System.out.println("The highest rated question is question 5 and has a total score of "+max);
				}
				
		}
		
		else if(menu==4){
			int total1=0;
			int total2=0;
			int total3=0;
			int total4=0;
			int total5=0;
				
			for(j=0;j<10;j++) 
			{
				total1 = total1 + (j+1)*responses[0][j];
				total2 = total2 + (j+1)*responses[1][j];
				total3 = total3 + (j+1)*responses[2][j];
				total4 = total4 + (j+1)*responses[3][j];
				total5 = total5 + (j+1)*responses[4][j];							
			}
				int min = total1;
				
				if(total2<min) {
					min=total2;
				}
				if(total2<min) {
					min=total3;
				}
				if(total4<min) {
					min=total4;
				}
				if(total5<min) {
					min=total5;
				}
				
				//
				if(total1==min) {
					System.out.println("The lowest rated question is question 1 and has a total score of "+min);
				}
				if(total2==min) {
					System.out.println("The lowest rated question is question 2 and has a total score of "+min);
				}
				if(total3==min) {
					System.out.println("The lowest rated question is question 3 and has a total score of "+min);
				}
				if(total4==min) {
					System.out.println("The lowest rated question is question 4 and has a total score of "+min);
				}
				if(total5==min) {
					System.out.println("The lowest rated question is question 5 and has a total score of "+min);
				}
		
		}
	}
	}
}
