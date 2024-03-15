import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("entre the num");
        int Num= sc.nextInt();
        int rev=0;
        while(Num>0)
        {
            int last_digit= Num%10;
            rev=(rev*10)+last_digit;
            Num/=10;

        }
        System.out.println(rev);
    } 
    
}