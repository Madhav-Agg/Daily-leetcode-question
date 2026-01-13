package Searching;

public class leetcode33 {
    public static void main(String[] args) {

    }
    static int search(int[] nums, int target) {
        int pivot =findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    static int binarySearch(int[]nums,int target,int start,int end) {
        int low = 0;
        int high = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
        static int findPivot(int[]nums){
            int low=0;
            int high = nums.length-1;
            while(low<=high){
                int mid = low+(high -low)/2;
                if(mid<high && nums[mid]>nums[mid+1]){
                    //here array changes
                    return mid;
                }
                else if(mid>low&&nums[mid]<nums[mid+1]){
                    return mid;
                }
                else if(nums[low]>=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
            return -1;
        }
    }

