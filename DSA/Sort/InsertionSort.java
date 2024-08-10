package DSA.Sort;

import java.util.Scanner;

public class InsertionSort {
    public static void inserion(int[] array){
        int i,j,temp;
        for ( i = 1; i < array.length; i++) {
            temp = array[i];
            j=i-1;
            while( j>=0 && temp<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] array = {13,1,45,23,65,56};
        inserion(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
