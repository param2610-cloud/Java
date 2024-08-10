
public class SelectionSort {
    public static int smallest(int[] array, int k){
        int smallest = array[k];
        int pos = k;
        for(int i = k+1;i<array.length;i++){
            if(array[i]<smallest){
                smallest= array[i];
                pos= i;
            }
        }
        return pos;
    }
    public static void selection(int[] array){
        for(int i = 0;i<array.length;i++){
            int small = smallest(array, i);
            int temp = array[small];
            array[small] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int[] array = {13,1,45,23,65,56};
        selection(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
