//64050152 Piyawach Muensri
import java.util.Scanner;

public class Java_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if (i>1){
                count++;
            }
            for(int j=0+count;j<i+2+count;j++){
                if(i==0){
                    for(int t=(2*n)-(2*(i+1))-1;t>0;t--){
                        System.out.print(" ");
                    } 
                }
                else if(i<n-1){
                    for(int t=(2*n)-(2*(i+1));t>0;t--){
                        System.out.print(" ");
                    }
                }
                for(int k=i+1-j+count;k>0;k--){
                    System.out.print(" ");
                }
                for(int u=0;u<j+1;u++){
                    System.out.print("*");
                }
                for(int v=0;v<j;v++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
