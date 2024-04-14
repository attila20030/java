import java.util.Scanner;
public class PartyArrasAndDividable{

    public static void main(String[] args) {
        


    
        System.out.println(partyValidation(15, 10));
        System.out.println(partyValidation(20, 20));
        System.out.println(partyValidation(25, 15));
        System.out.println(partyValidation(0, 10));

        
    }

    public static String partyValidation(int lanyok, int fiuk) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon  meg egy számot: ");
        int lany = sc.nextInt();

        System.out.println("Kérem a fiuk számát: ");
        int fiU = sc.nextInt();

        sc.close();

        int osszes = lanyok + fiuk;
        if (osszes>= 20) {
            if (lanyok == fiuk) {
                return "The party is excellent!";
            } else {
                return "Quite a cool party!";
            }
        } else {
            if (lanyok == 0) {
                return "Sausage party!";
            } else {
                return "Average party...";
            }
        }
    }
}
