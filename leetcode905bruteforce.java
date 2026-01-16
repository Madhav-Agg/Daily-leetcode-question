package Sorting;

import java.util.Arrays;

public class leetcode905bruteforce {
    public static void main(String[] args) {
        int []arr={3,1,2,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int []nums){
        boolean swapped;
        for(int i=0;i<nums.length;i++){
            swapped =false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]%2==0 && nums[j-1]%2 !=0){
                    int temp =nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
