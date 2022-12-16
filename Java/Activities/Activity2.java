package activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args){
        int[] arr={10,77,10,54,-11,10};
        System.out.println("original arr numbers:"+ Arrays.toString(arr));
        int find_arr=10;
        int final_value=30;
        System.out.println("final result:"+ result(arr,find_arr,final_value));
    }
    public static boolean result(int[] arr1, int find_arr, int final_value){
        int arr2=0;
        for(int i:arr1)        {
            if(i==find_arr)
            {
             arr2=arr2+find_arr;
            }
            if(arr2>final_value){
                break;
            }
        }
        return arr2==final_value;
    }

}
