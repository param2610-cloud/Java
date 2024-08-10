public class AdvancePattern {
    public static void main(String args[]){
        int n = 5;
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= n / 2) {
                    if (j <= i || j >= n - i - 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print(" \t");
                    }
                } else {
                    if (j <= n - i - 1 || j >= i) {
                        System.out.print("*\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
            }
            System.out.print("\n\n");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n-1-i;j++){
                System.out.print(" \t");
            }
            for(int j=0;j<n;j++){
                System.out.print("*\t");
            }
            System.out.print("*\n\n");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i;j++){
                if(j%2==0){
                    System.out.print(i+"");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i <=n; i++) {
            for(int j=0;j<=n-i;j++){
                System.out.print(" \t");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+"\t");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+"\t");
            }
            System.out.print("\n\n");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i <=2*n; i++) {
            if(i<n){

                for(int j=0;j<=n-i;j++){
                    System.out.print(" \t");
                }
                for(int k=0;k<=(2*i)+1;k++){
                    System.out.print("*\t");
                }
            }else{
                for(int j=0;j<i-n;j++){
                    System.out.print(" \t");
                }
                for (int k = 0; k < (4 * n - 2 * i) - 1; k++) {
                    System.out.print("*\t");
                }
                
            }
            System.out.print("\n\n");
        }
    }
}
