import java.util.Scanner;
public class MultiTable {
    static void multiTable(int n){
        int i=1;
        while(i<=10){
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        multiTable(num);
    }
}
