import java.util.*;
class FirstClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimention of square:");
        int n = sc.nextInt();
        for( int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1){
                    System.out.print("*\t");
                }else if(i!=0 && j==0 || j==n-1){
                    System.out.print("*\t");
                }else{
                    System.out.print(" \t");
                }
            }
            System.out.print("\n\n");
        }
        System.out.println("Print right angle triangle: ");
        for( int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*\t");
            }
            System.out.print("\n\n");
        }
        System.out.println("Print reverse right angle triangle: ");
        for( int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*\t");
            }
            System.out.print("\n\n");
        }
        for( int i=1;i<=n;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" \t");
            }
            for(int j=0;j<i;j++){
                System.out.print("*\t");
            }
            System.out.print("\n\n");
        }
        for( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.print("\n\n");
        }
        for(int i =0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+"\t");
            }
            System.out.print("\n\n");
        }
        System.out.println("Triangle:");
        
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 ==0){
                    System.out.print("1\t");
                }else{
                    System.out.print("0\t");
                }
            }
            System.out.print("\n\n");
        }
    }
}