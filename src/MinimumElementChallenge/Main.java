package MinimumElementChallenge;

import java.util.Scanner;

public class Main
{
    //private so the other classes cannot access it, only the main
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args)
    {
        System.out.println("Enter count: ");
        int count = sc.nextInt();
        sc.nextLine();

        int[] returnedArray = readInteger(count);
        int returnMin = findMin(returnedArray);

        System.out.println("min = "+ returnMin);

    }

    public static int[] readInteger(int count)
    {
        int[] array = new int[count];

        for(int i=0; i<array.length; i++)
        {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            sc.nextLine(); //space needed after number entry
            array[i] = number;

        }
        return array;
    }

    private static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE; //

        for(int i=0;i< array.length;i++)
        {
            int value = array[i];

            if(value < min)
            {
                min = value;
            }
        }

        return min; //returns the smallest number in the array
    }

}
