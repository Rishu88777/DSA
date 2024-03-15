public class palindrom {
    public static void polindrom_or_not(int n){
        int given_num=n;
        int pow =0;
        int Num=0;
        while(n>0){
        int rem=n%10;
        Num= Num+rem*(int)Math.pow(10,pow);
        n=n/10;
        pow++;
        }
        System.out.println(Num);
    }
      /* 
        if(Num==given_num){
            System.out.println("no is polindrom");
        }
        else{
            System.out.println("no is not polindrom");
        }
    }*/
    public static void main(String args[]){
       polindrom_or_not(231);
    }
    
}