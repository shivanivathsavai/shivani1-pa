package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "KMC India KMC India welcomes you";
        System.out.println("Original String:"+input);
        /*splitting the input as array*/
        String[] arr = input.split(" ");
        String output="";
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i].equals(arr[j]))
                {
                    arr[j] = "remove";
                    arr[i] = "remove";
                }
            }
        }
        /*printing only other words except remove*/
        for (String word : arr) {
            if (word != "remove") {
                output = output + word + " ";
            }
        }

        String words[] = output.split(" ");
        String reversedString = "";

        //Reverse each word's position
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }

        System.out.print("Reversed string : " + reversedString);
    }
    }

