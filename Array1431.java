package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array1431 {
    public static void main(String[] args){
        int arr[] = {10,9,8,2,10};
        int max = arr[0];
        int extracandies = 3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }System.out.println(max);
        //Not suitable for dynamic array
        // boolean newArray[] = new boolean[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     newArray[i] = (arr[i]+ extracandies >= max);
        //     System.out.println(newArray[i]);
        // }
        
        // System.out.println(Arrays.toString(newArray));
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           result.add((arr[i]+extracandies)>= max);
        }
        System.out.println(result);
       
        
    }
}
