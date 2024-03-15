import java.util.*;
public class print_prime {
    public static boolean isprime(int a){
        if(a==2)
        return true;
        for( int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)
            return false;
        }
        return true;
    }

      public static void printprime(int a){
        for(int i=1;i<=a;i++){
           if(isprime(i)){
            System.out.print(i+" ");
           }
        }

     }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no");
        int a=sc.nextInt();
        printprime(a);
    }
    
}
