package ArrayPractice1;

import java.util.Scanner;

/* We are going to use an array to accept input from the console,
sum up those numbers, and compute the average.
 */

public class Main
{
    //allows for user input
    private static Scanner sc = new Scanner(System.in);

        public static void main (String[]args)
        {
            int[] myInts = getInts(5); //an array to store 5 numbers

            for(int i = 0; i<myInts.length; i++)
            {
                System.out.println("Element "+ i+", typed value was "+
                        myInts[i]);

        }

            System.out.println("The average is "+ getAverage(myInts));
    }

    /* The method below will use the stored array value amount.
    This also allows for flexibility to use any numbers we want
    with the only limitation being the length of the array.

     */
    public static int[] getInts(int number)
    {
        System.out.println("Enter " + number+ " int values.\r"); // slash r allows the entry to start on the next line
        int[] values= new int[number];

        for(int i=0; i< values.length;i++) //checks thorough the length of the values array
        {
            values[i]= sc.nextInt(); //allows the number entries to be assigned to the index of the array individually
        }
        //returns the values entered
        return values;
    }

    /* method to get the average of the numbers entered.
    The method should return double with a parameter of an
    array.

     */
    public static double getAverage(int[] array)
    {
        int sum = 0; //initialized to store the sum of the numbers

        for(int i = 0; i< array.length; i++)
        {
            sum += array[i]; //takes each entry of the array index and adds them cumulatively

        }
        //returns the amount as a double, taking the total and dividing by the array length
        return (double) sum / (double) array.length;
    }
}
