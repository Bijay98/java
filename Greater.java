import java.util.Scanner;
public class Greater {
    static void calcLation(int x,int y){
        if(x>y) {
            System.out.println("greatest number is "+x);
        } else if (x<y) {
            System.out.println("greatest number is "+y);
        }
        else {
            System.out.println("both numbers are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        calcLation(a,b);

    }
}
