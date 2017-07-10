/*
 * Write a program in java to implement type casting between different variables.
 * Take six variables as one of each byte, short, int, long, float and double. Initialize only byte and short asking the value from the user.
 * Take byte & short variables and store their sum in the integer variable and print the sum and then take short and int and store their addition in a long variable
 *  and now take an int and long and so on.
 */

package acadglid.javaIntroSession.session;

import java.util.Scanner;

public class Assignment4 {

	public static void main (String [] args) {

		//1. Initialize the instance of scanner class and then take input from user

		Scanner sc = new Scanner(System.in);

		//2. Initialize the two variable of byte and short 

		byte firstVariable;

		short secondVariable;

		int thirdVariable;

		long forthVariable;

		float fifthVariable;

		double sixVariable;


		//3. Input value from the user 

		System.out.println("Enter the first value which is byte");

		firstVariable = sc.nextByte();

		System.out.println("Enter the second value which is short");

		secondVariable = sc.nextShort();

		//4. Store value of byte and short in integer 


		thirdVariable = firstVariable + secondVariable;

		//5. Print the  integer sum 


		System.out.println("The sum of two variable byte("+firstVariable+") and short("+secondVariable+") is store in Integer variable:"+thirdVariable);


		//6. Take short and Integer and store in long 

		forthVariable = secondVariable + thirdVariable;

		//7. Print the  Long  sum 

		System.out.println("The sum of two variable short("+firstVariable+") and Integer("+thirdVariable+") is store in Long variable:"+forthVariable);

		//8. Take Integer and long and store in float 

		fifthVariable = thirdVariable + forthVariable;

		//9. Print the  Float  sum 

		System.out.println("The sum of two variable Integer("+thirdVariable+") and long("+forthVariable+") is store in float variable:"+fifthVariable);


		//8. Take Long and Float and store in Double 


		sixVariable = forthVariable + fifthVariable;

		//9. Print the  Double  sum 

		System.out.println("The sum of two variable Float("+thirdVariable+") and long("+forthVariable+") is store in Double variable:"+sixVariable);


	}

}
