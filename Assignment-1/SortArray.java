

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Integer [] input = new Integer[] {2, 7, 3, 8, 11, 12};
        sortMyArray(input);
    }
    public static void sortMyArray(Integer [] input) {
        int siz=input.length;
        Arrays.sort(input);
        int[] num1 = new int[siz/2];
        int[] num2 = new int[siz/2];
        int m=0;
        int n=0;
        num1[m]=input[siz-1];
        m=1;
        int z=0;
        for(z=siz-2;z>=0;z--)
        {
            if(Arrays.stream(num2).sum()<=Arrays.stream(num1).sum())
            {
                num2[n]=input[z];
                n++;
                if(n==siz/2){
                    break;
                }
            }
            else{
                num1[m]=input[z];
                m++;
            }
        }
        if(num1[m]==0)
        {
            for(int c=z-1;c>=0;c--)
            {
                num1[m]=input[c];
                m++;
            }
        }
        for(int x=0;x<siz;x++)
        {
            if(x<siz/2){
                input[x]=num1[x];
            }
            else{
                input[x]=num2[x-siz/2];
            }
        }
        for(int e=0;e<siz;e++)
        {
            System.out.print(input[e]+" ");
        }
        return;
    }
}