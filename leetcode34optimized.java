package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode34optimized {
    public static void main(String[] args) {
        int[]nums={2,3,4,5,5,5,7,7,7,7,8,9};
        int target =7;
        System.out.println(Arrays.toString(range(nums,target)));
    }

    static int search(int[] nums, int target, boolean firstindex){

        int ans =-1;
        int low =0;
        int high = nums.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                ans=mid;
                if(firstindex){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }

        }
        return ans;
    }
    public static int []range(int[] nums, int target){
        int []ans={-1,-1};
        int low= search(nums,target,true);

        int high= search(nums,target,false);
        ans[0]=low;
        ans[1]=high;
        return ans;


    }
}

