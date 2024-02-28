import java.util.Scanner;

public class Dolgozat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot: ");
        int sugar= sc.nextInt();

        System.out.println("A kör kerülete: " + (sugar*sugar) * Math.PI);


        sc.close();
    }
}
