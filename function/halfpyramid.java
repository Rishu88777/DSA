public class halfpyramid {
    public static void halfpyr(int a,int b){
        for (int i= 1;i<=a;i++){
            for(int j=1;j<=b-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        halfpyr(4,4);
    }
}