package ReverseArrayChallenge;

import java.util.Arrays;

public class Main
{
    public static void main(String[]args)
    {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Array = "+ Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed Array = "+ Arrays.toString(array));

    }

    private static void reverse(int[] array)
    {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++)
        {
            int temp = array[i]; //saves the variables as they are read individually
            array[i] = array[maxIndex - i];
            array[maxIndex-i] = temp;
        }

    }
}
