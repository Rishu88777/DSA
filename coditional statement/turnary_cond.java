import java.util.Scanner;
public class turnary_cond {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("marks:");
       int marks=sc.nextInt();
       String result= ((marks>=33)? "pass": "fail");
       System.out.println(result);
      
    }
    
}