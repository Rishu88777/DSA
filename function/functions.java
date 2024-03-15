import java.util.*;
public class functions {
    public static int calculatesum( int num1,int num2){
        int sum= num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("first no");
        int a= sc.nextInt();
        System.out.println("second no.");
        int b= sc.nextInt();
        int sum=calculatesum(a,b);
        System.out.println( "sum is "+ sum);

    }
    
}
