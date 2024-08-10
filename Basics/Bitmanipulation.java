public class Bitmanipulation {
    public static void main(String args[]){
        int number = 5; //0101
        int pos = 2;
        int bitmask = 1<<pos;
        int notbitmask = ~bitmask;
        int update1= notbitmask & number;
        int update0 = bitmask | number;
        System.out.println(update1);
        System.out.println(update0);
    }
}
