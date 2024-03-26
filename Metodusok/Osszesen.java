import java.util.Scanner;

public class Osszesen{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy egész számot: ");

        int szam = scanner.nextInt();

        int sum = Sum(szam);
        System.out.println("A számok összege 0-tól " + szam + "-ig: " + sum);
        scanner.close();
    }

    public static int Sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
