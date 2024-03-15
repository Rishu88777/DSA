import java.util.*;
public class product {
    public static int product(int a,int b){
        int product= a*b;
        return product;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("first no");
        int a = sc.nextInt();
        System.out.println("second no:");
        int b= sc.nextInt();
         int product=product(a,b);
         System.out.println(product);
    }
    
}
