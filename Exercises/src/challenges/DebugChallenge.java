package challenges;
/*
 * Debugging sample
 */

import java.util.*;
/**
 *
 * @author Peggy Fisher
 */
public class DebugChallenge {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //find the average of a series of numbers
        int count = 0;
        double total=0;
        System.out.println("Enter a number: ");
        while(in.hasNextDouble())
        {
            total += in.nextDouble();  
            count++;
            System.out.println("Enter next number or Q to quit: ");
        }
        //to find the average, divide the total by the count of items
        double average = total/count;
        System.out.println("Average is: "+ average);
        //  find the average of these three numbers, the output 
        //  should be 5.33 repeated
        double avg = (3+5+8)/3.0;
        System.out.println("The average is: "+ avg);
        //  find the celsius temp given the fahrenheit temp
        //  when the fahrenheit is 212, the celsius is 100
        int F = 212;
        double C = 5.0/9.0*(F-32);
        System.out.println("Celsius: "+C); 
        in.close();
    }
}
