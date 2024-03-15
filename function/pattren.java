public class pattren {
    public static void holllow_rectangle(int row,int col){
        //outer loop
        for(int i=1;i<=row;i++){
            //innner loop
            for(int j=1;j<=col;j++){
                //cell
                if(i==1||i==row||j==1||j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        holllow_rectangle(4,5);
    }
}
