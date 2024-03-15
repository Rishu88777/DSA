import java.util.*;
public class continue_{
    public static void main(String []args){
        Scanner sc= new Scanner (System.in);
       do
        {
            System.out.print("enter your no: ");
            int i=sc.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println( "new no: " + i);
        }while(true);
}
}

