import java.util.Scanner;

public class M3Q15{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int h = scn.nextInt();
        fun(w,h);
  
    }
    public static void fun(int w, int h){
        for(int i = 1; i <= h; i++ ){
            for(int k = 1; k <= w; k++){
                System.out.print(i * k + "\t");
            }
            System.out.println();
        }
    } 
}