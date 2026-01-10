package Searching;

public class leetcode744 {
    public static void main(String[] args) {
        char []arr ={'c','f','j'} ;
        char ans = nextGreatestLetter(arr,'d');
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
            int low =0;
            int high = letters.length-1;
            while(low<=high){
                int mid = low+(high - low)/2;
                if(letters[mid]>target){
                    high =mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            return letters[low % letters.length];
    }
}
