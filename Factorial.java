import java.util.Scanner;
public class Factorial {
    static void factorialNumber(int n,int fact){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int num=sc.nextInt();
        int fact=1;
        factorialNumber(num,fact);
    }
}
