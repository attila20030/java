import java.util.Scanner;

public class Dolgozat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg a nevét: ");
        String nev = sc.nextLine();
        System.out.println(" Szia " + nev);

        sc.close();
    }
}
