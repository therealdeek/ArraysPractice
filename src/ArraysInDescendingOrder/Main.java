package ArraysInDescendingOrder;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args)
    {
        int[] myNums = getNums(5);
        int[] sorted = intSort(myNums);
        printArray(sorted);

    }

    public static int[] getNums(int capacity)
    {
        int[]array = new int[capacity];

        System.out.println("Enter "+ capacity+ " int values:\r");

        for(int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        return array;

    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            System.out.println("Element " +i + " contents "+ array[i]);
        }

    }

    public static int[] intSort(int[] array)
    {
       // int[] sortedArray = new int[array.length];
       //  for(int i = 0; i< array.length;i++)
       // {
       //     sortedArray[i] = array[i]; //the array values will be stored in sortedArray
       // }

        /*
            an alternative way to copy the past array to the sorted array
            is below. This helps to reduce code and be more efficient.
         */

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true; //initially set to true
        int temp;

        while(flag) //we run the while loop to test whether or not the for loop index numbers change
        {
            flag = false; //if the for loop doesn't accept all numbers then the while loop will run

            /* element 0 is 50
               element 1 is 160
               element 2 is 40

               1. presume the first element is 50
               2. the for loop will check to see if zero is less than the array length -1
               3. now the if statement is checked using the first element 50
               4. 50, being the first element(index place of zero) will be compared to 160(index place of 0(i)+1)
               5. 50 is less than 160, so the temp will be 160
               6. Now, 160 is complete and added to index 0 via the temp variable
               7. 50(index 1) is now compared to 40(index 2)
               8. Since 50 is not less than 40, the if statement will not run
               9. Yet, we still have the flag set to true.
               10. So, with the flag intialized as true, and flag is true following the assignment
                   of the variable temp and sortedArray, we know that the numbers
                   are sorted properly from highest to lowest (index 0 to the last index of the array)
               11. Now, out of the if statement, we go back to the while loop
                  where we have a false flag. We proceed through to the if statement
                  which returns false due to the larger number not being less than
                  the smaller number in sequence.
               12. Finally, out of the while loop, we return the sortedArray(last lowest value).

             */
            for(int i =0; i< sortedArray.length-1; i++)
            {
                if(sortedArray[i] < sortedArray[i+1])
                {
                    temp = sortedArray[i]; //temporarily stores the lesser array value(index = i)
                    sortedArray[i] = sortedArray[i+1]; //next the "indexed element" +1 is now moved to i
                    sortedArray[i+1] = temp; //now the temporary variable is assigned back
                    flag = true;
                }
            }
        }

        return sortedArray;
    }


}
