import java.util.Random;
import java.util.Scanner;

public class M3Q13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(scn.nextLong());
        int n[][] = new int [10][10];
        for(int i = 0 ; i < 10 ; i++){
            for(int k = 0 ; k < 10 ; k++){
                n[i][k] = rand.nextInt(10);
            }
        }
        for (int k = 0 ; k < 10 ; k++){
            for(int i = 0 ; i < 10 ; i++){
                System.out.print(n[i][k]+ "\t");
            }
            System.out.println();
        }
    }
}