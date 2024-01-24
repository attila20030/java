import java.util.Scanner;

public class feladat3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kedvenc zeneszámod: ");
        String zeneszam = scanner.nextLine();
        System.out.print("Kedvenc ételed: ");
        String eteled = scanner.nextLine();
        System.out.print("Kedvenc filmed: ");
        String filmed = scanner.nextLine();
        System.out.print("Kedvenc uticélod: ");
        String uticel = scanner.nextLine();


        System.out.println("Kedvenc zeneszámod: " + zeneszam );
        System.out.println("Kedvenc ételed: " + eteled );
        System.out.println("Kedvenc uticel: " + uticel );
        System.out.println("Kedvenc filmed " + filmed );
    }
}

