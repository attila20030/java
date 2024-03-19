import java.util.Scanner;

public class Tomb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot ami megadja az adatok hosszát: ");
        int szam2 = sc.nextInt();


        double[]szamoktomb = new double[szam2];

        for (int i = 0; i < szam2; i++){
            System.out.println("Adj egy számot:");
            szamoktomb[i] = sc.nextDouble();
            }

        for (int i = 0; i < szam2; i++) {
            System.out.println(szamoktomb[i]);
          }


        sc.close();

    }    
}
