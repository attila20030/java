import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy pozitív egész számot (n): ");
        int n = sc.nextInt();

        long szam1 = calculateFibonacci(n);
        System.out.println("Az " + n + " fibonacci száma/számai: " + szam1);

        sc.close();
    }

    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Ezeknek a számokn ak nincs fibonacci értéke.");
        }
        if (n == 1 || n == 2) {
            return n - 1;
        }

        long prev = 0;
        long curr = 1;
        for (int i = 3; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
} 
