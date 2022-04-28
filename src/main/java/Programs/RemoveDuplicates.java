package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "KMC India KMC India welcome you";
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        System.out.println("original String:" + input);
        StringBuilder output = builder.replace(0, 20, "output String:");
        System.out.println(output);
        String output1 = "welcome you";
        String[] array = output1.split(" ");
        String[] array1= new String[2];
        array1[0]=array[1];
        array1[1]=array[0];
        System.out.println("reversing string:"+Arrays.toString(array1));

    }
    }

