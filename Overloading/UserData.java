import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg a vezetéknnevét: ");
        String vnev = sc.toString();

        System.out.println("Kérem adja meg a keresztnevét: ");
        String knev = sc.toString();

        System.out.println("Kérem adja meg az életkorát: ");
        int eletkor = sc.nextInt();

        sc.close();

    }
    
    // Felhasználó nevének és életkorának kiírása
    public static void printUserData(String vnev, String knev, int eletkor) {
        System.out.println(vnev + " " + knev + " " + eletkor);
    }
}
