package DSA.recursion;

public class TowerOfHanoi {
    public static void tower_of_hanoi(int n, String src , String helper , String Dest ){
        if(n==1){
            System.out.println("Transfer disk "+ n +" "+src +" to "+ Dest);
            return;
        }
        tower_of_hanoi(n-1, src, Dest, helper);
        System.out.println("transfer disk "+ n+ " from"+src +"to" + Dest);
        tower_of_hanoi(n-1, helper,src, Dest);
    }
    public static void main(String[] args) {
        int n=30;
        tower_of_hanoi(n, "S", "H", "D");
    }
}
