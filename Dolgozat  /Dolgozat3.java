import java.util.Scanner;

public class Dolgozat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot (1-90 között): ");
        int szam1 = sc.nextInt();
        if( szam1 > 0 && szam1 < 90){
            System.out.println("A szám helyes!");
        }
        else if( szam1 < 0 && szam1 > 90){
            System.out.println("A szám helytelen!");
        }
        else if(szam1 % 3 == 0 && szam1 > 0 && szam1 < 90){
            System.out.println("Fizz");
        }
        else if(szam1 % 5 == 0 && szam1 > 0 && szam1 < 90){
            System.out.println("Buzz");
        }

        else if(szam1 % 5 == 0 && szam1 % 3 == 0 && szam1 > 0 && szam1 < 90){
            System.out.println("FizzBuzz");
        }

        else if(szam1 % 5 != 0 && szam1 % 3 != 0 && szam1 > 0 && szam1 < 90){
            System.out.println(szam1);
        }
        sc.close();

    }
}
