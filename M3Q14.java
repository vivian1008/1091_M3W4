import java.util.Scanner;

public class M3Q14{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char c = scn.next().charAt(0);
        square(n,c);
    }

    public static void square(int v1 , char v2){
        for(int i = 0; i < v1; i++){
            for(int j = 0; j < v1; j++){
                System.out.print(v2);
            }
            System.out.println();
        }
    }
}