import java.lang.math;

class Solution {
    public int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length - 1];
        if (lastDigit == 9) {
            int newArray[] = new int[digits.length + 1];
        } else {
            int newArray[] = new int[digits.length];
        }
        plus(newArray, 0, digits.length - 1);
    }

public static void plus(int newArray[],int carry,int idx){
    if(idx==0){
        if(carry==1){
            newArray[0]=1;
            return;
        }else{
            newArray[idx]=newArray[idx]+1;
            return ;
        }
…        }
    }
}