public class decTobin {
    public static void dec_bin(long a){
        long binary=0;
        long pow =0;
        while(a>0){
            long rem=a%2;
            binary= binary +(rem*(long)Math.pow(10,pow));
            pow++;
            a=a/2;
        }
        System.out.println(binary);
    }
    public static void main(String args[]){
        dec_bin(10);

    } 
}