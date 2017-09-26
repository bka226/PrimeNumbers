/* *****************
 Name: Binod Katwal
 Date: 09/07/2017
 Purpose: To understand basic java program as well as to compute to display prime numbers below 1000.
 ******************* */
package com.company;
import java.util.Scanner; // inserted Scanner

public class PrimeNumbers
{
    public static void SieveOfEratosthenes(int num)
    {
        boolean valueArray[] = new boolean[1000]; //boolean  array 1000
        int list[] = new int[1000]; 		// value of array limited to 1000
        int prime ; 				// declaration of variables

        for ( int val = 0; val < num - 1; val++)
        {
            list[val] = val + 2; 	// list is above 2
            valueArray[val] = true; // variables is setting as true
        }
        for (int factor = 0; factor < num / 2 + 1; factor++ )
        {
            if (valueArray[factor] == true) // if true variable, check for prime
            {
                prime = list[factor]; 	//prime
                for (int val2 = factor+1; val2 < num -1; val2++) // else check if not prime below
                {
                    if ( list[val2] % prime == 0)
                    {
                        valueArray[val2] = false; //not prime so skip;
                    }
                }
            }
        }
        //Display the results
        System.out.println("************************************");
        System.out.println("Printing prime numbers as requested:");
        System.out.println("************************************");
        for (int val = 0; val < num -1; val++)
        {
            if ( valueArray[val]==true)
            {
                System.out.println("          " + list[val]); // List of requested integers.
            }
        }
        System.out.println("********************************");
    }


    // MAIN FUNCTION
    public static void main (String args[])
    {
        System.out.println ("Please enter a number :"); //asks users to enter a number
        Scanner results = new Scanner(System.in); 	//Variable declaration results , system.in - user input
        String L = results.nextLine(); 			// will get results using scanner
        int num = Integer.parseInt(L);			//parse integer from nextline()
        SieveOfEratosthenes(num); 			//Calls the function

    }


}