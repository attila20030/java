import java.util.Scanner;

public class Szamol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Kérem adjon meg egy számot: ");
        int szam1 = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % szam1 == 0) {
                continue;
            }
            System.out.println(i);

            if (i == szam1 * 10) {
                break;
            }
        }
        sc.close();
    }
}
