package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class NumberOrder
{
    public static  void order(int[] input,boolean flag)
    {
        int temp;

        for (int i = 0; i < input.length; i++)
        {
            for (int j = i + 1; j < input.length; j++)
            {
                if (input[i] > input[j])
                {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }

        }
        if (flag )
        {
            for(int array:input)
            {
                System.out.print( array+",");
            }
        }
        else
        {
            for (int desc=input.length-1; desc>=0; desc--)
            {
                System.out.print(input[desc]+",");
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 5, 1, 2};
        order(input,false);

    }
}
