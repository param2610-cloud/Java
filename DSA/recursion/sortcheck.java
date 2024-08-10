package DSA.recursion;

public class sortcheck {
    public static boolean SortedArrayCheck(int array[],int idx){
        if(idx==array.length-1){
            return true;
        }
        if(SortedArrayCheck(array, idx+1) && array[idx]<array[idx+1]){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int array [] = {12,12,67,87,96};
        System.out.println("Sorted: "+SortedArrayCheck(array, 0));
    }
}
