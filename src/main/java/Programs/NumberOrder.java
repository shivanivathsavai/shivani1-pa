package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class NumberOrder
{
    public static void main(String[] args)
    {
        int a[]={4,3,5,6,1,2};

        /*Using set to ordering elements*/

        TreeSet<Integer> set= new TreeSet<Integer>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }
        System.out.println(set);
        int b[]={1,2,3,4,5,6};
        for(int i=b.length-1;i>=0;i--)
        {
            list.add(b[i]);
        }
        System.out.println(list);

    }
}
