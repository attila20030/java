import java.util.Scanner;

public class Szamol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot: ");
        int szam1 = sc.nextInt();

        System.out.println("Kérem adjon meg egy másik számot: ");
        int szam2 = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % szam1 == 0 && i % szam2 != 0) {
                System.out.println("Fizz");
            }
            else if(i % szam2 == 0  && i % szam1 != 0){
                System.out.println("Buzz");
            }
            else if(i % szam1 == 0 && i % szam2 == 0){
                System.out.println("FizzBuzz");
                break;
            }
            else if(i % szam1 != 0 && i % szam2 != 0){
                System.out.println(i);
            }
        }
    }
}
