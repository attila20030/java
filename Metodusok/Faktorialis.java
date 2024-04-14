import java.util.Scanner;

public class Faktorialis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy egész számot: ");
        int szam1 = sc.nextInt();

        long faktorial = calculateFactorial(szam1);
        System.out.println(szam1 + " faktoriálisa " + faktorial);

        sc.close();
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Ennek a számnak a faktoriálisát nem lehet kiszámolni:");
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
