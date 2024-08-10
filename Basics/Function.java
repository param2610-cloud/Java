import java.util.*;

class Function{
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static boolean prime_or_not(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static double Addodd(int n){
        int sum =0;
        for (int i = 1; i <=n; i=i+2) {
            sum = sum +i;
        }
        return sum;
    }
    public static void infiniteLoop(){
        do{
            System.out.println("🙄");
        }while(true);
    }
    public static void identifier(){
        Scanner sc = new Scanner(System.in);
        int zero = 0;
        int positive = 0;
        int negative = 0;
        while (true) {
            System.out.print("Enter number(0.01 to cancel): ");
            Double a = sc.nextDouble();
            if(a==0.01){
                break;
            }
            else if(a==0){
                zero++;
            }else if(a>0){
                positive++;
            }else{
                negative++;
            }
        }
        System.out.println("The number of zero: "+zero);
        System.out.println("The number of positive: "+positive);
        System.out.println("The number of negative: "+negative);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(10));
        System.out.println(prime_or_not(7));
        System.out.println(average(7,4,5));
        System.out.println(Addodd(122));
        infiniteLoop();

    }
}