package ArrayReverseChallenge;

import java.util.Arrays;

public class Main
{
    public static void main(String[]args)
    {
        int[]array = {10, 20, 30, 45, 56};

        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println(Arrays.toString(array));



    }

    private static void reverse(int[] array)
    {
        //int maxIndex = array.length-1;
        //int halfLength = array.length/2;

        for(int i =0; i< array.length/2;i++)
        {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

    }
}
