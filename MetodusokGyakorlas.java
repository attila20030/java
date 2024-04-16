import java.util.Scanner;

public class MetodusokGyakorlas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg a szög számát: ");
        double szog = sc.nextDouble();

        String eredmeny = szogElnevezes(szog);
        System.out.println("A szög neve: " + eredmeny);

        sc.close();
    }

    public static String szogElnevezes(double szog) {
        if (szog < 0) {
            return " Negatív szög";
        } else if (szog == 0) {
            return "Nullszög";
        } else if (szog < 90) {
            return "Hegyes szög";
        } else if (szog == 90) {
            return "Derék szög";
        } else if (szog < 180) {
            return "Tompaszög";
        } else if (szog == 180) {
            return "Féltengely";
        } else if (szog < 360) {
            return "Homorú szög";
        } else {
            return "Teljes szög vagy nagyobb";
        }
    }
}
