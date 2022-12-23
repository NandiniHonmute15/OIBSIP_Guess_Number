import java.io.*;
import java.util.Scanner;
import java.util.Random;

class GuessNoGame 
{
	public static void main(String args[])
    	{
		char ch;
        	int result, guess;
		final int n = 100;
		boolean right = false;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		result = random.nextInt(n) + 1;
  		System.out.println(".....Welcome in Game of Number Guessing.....\n\n");
	    	do 
		{
			System.out.println("Guess the number between 1 and 100: ");
			guess = sc.nextInt();
			if(guess>result) 
			{
                		System.out.println("Entered Number is Large...");
            		}
  			else if(guess<result) 
			{
                		System.out.println("Entered Number is Small...");
            		}
			else 
			{
				System.out.println("Yes, You guessed the number correctly...");
  				right = true;
            		}
		}while(!right);
		System.exit(0);
        }
}
