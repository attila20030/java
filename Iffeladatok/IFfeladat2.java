import java.util.Scanner;

public class IFfeladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg a magasságát: ");
        int magassag = sc.nextInt();

        if(150 <= magassag && magassag < 165){
            System.out.println("S");
        }
        else if( 165 <= magassag && magassag < 175){
            System.out.println("M");
        }
        else if( 175 <= magassag && magassag < 185){
            System.out.println("L");
        }
        else if(185 <= magassag && magassag < 195){
            System.out.println("XL");
        }
        else if(195 <= magassag && magassag < 150){
            System.out.println("NO SIZE");
        }

    }
}
