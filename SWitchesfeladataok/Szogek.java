import java.util.Scanner;


public class Szogek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy szöget: ");
        int szog = sc.nextInt();

        switch(szog){
            case 0:
            System.out.println("Nullszög");
            break;

            case 90:
            System.out.println("Derékszög");
            break;

            case 180:
            System.out.println("Egyenesszög");
            break;

            case 360:
            System.out.println("Teljesszög");
            break;

            default:

            if( szog <= 0 && szog < 89 )
            System.out.println("Hegyesszög");

            if( szog <= 91 && szog < 179 )
            System.out.println("Tompaszög");

            if( szog <= 181 && szog < 359 )
            System.out.println("Homorúszög");

            sc.close();
        }
    }
}
