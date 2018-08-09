package JavaPrograms;

import java.util.Scanner;
//##########################
public class FibboExample {
	
	public static void main(String[] args) {
		//Enter two number for num1 n num2
		int num1=1, num2=1;
		
		//Enter numbers 
		System.out.println("Enter Numbers: ");
		Scanner in= new Scanner(System.in);
		int num= in.nextInt();
		
		System.out.print(num1 + ", " + num2 + ", ");
		
		for(int i =0;i<=num;i++)
		{//Enter numbers 
			
			num2= num1 + num2;
			int temp = num1;
			num1=num2;
			num2=temp;
			//print series
			System.out.print(num2 + ",");
			
		}
		
		
	}

}
