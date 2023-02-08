import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int x = sx.nextInt();
        int y = sx.nextInt();
        String ssttrr = "";



        for (int o = 0; o <= y - 1; o = o + 2){
            System.out.println();
            for (int i = 0; i <= x-1; i = i + 1) {
                System.out.print("*_");
            }
            for (int p = 1; p <= y - 1; p = p + 2){
                System.out.println();
                for (int i = 0; i <= x - 1; i = i + 1) {
                    System.out.print("_*");

                }
                break;
            }

        }

    }
}













































