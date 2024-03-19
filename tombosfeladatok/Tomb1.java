import java.util.Scanner;

public class Tomb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot ami megadja az adatok hosszát: ");
        int szam1 = sc.nextInt();


        int[]szamoktomb = new int[szam1];

        for (int i = 0; i < szam1; i++) {
            System.out.println("Adj egy számot:");
            szamoktomb[i] = sc.nextInt();
            }


        for (int i = 0; i < szam1; i++) {
            System.out.println(szamoktomb[i]);
          }


        sc.close();

    }    
}
