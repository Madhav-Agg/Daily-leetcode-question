package Searching;

public class leetcode852 {
    public static void main(String[] args) {
        int []arr={0,2,1,0};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr) {
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int mid = start + (end-start)/2;
                if(arr[mid]>arr[mid+1]){
                    end=mid;
                }
                else{
                    start=mid+1;
                }
            }
            return start;//return end also works
    }

}
