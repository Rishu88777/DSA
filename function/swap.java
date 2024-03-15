public class swap {
    public static int swap_num(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        return a;
    }

    public static void main(String args[]){
        int a= 5;
        int b=10;
        swap_num(a,b);
       System.out.println(a);
        
    }
}
