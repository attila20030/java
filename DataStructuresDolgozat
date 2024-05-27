import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import javax.management.openmbean.ArrayType;

public class DataStructuresDolgozat {

    public static void main(String[] args) {

        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        // 1 pont
        ArrayList<String> varosok = new ArrayList<>();
        

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        varosok.add("Wien");
        varosok.add("Budapest");
        varosok.add("Prag");
        varosok.add("Bratislava");
        

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(varosok);


        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővásrosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont
        ujElemHozzaadasa.add("Ljubljana");
        ujElemHozzaadasa.add("Sarajevo");
        ujElemHozzaadasa.add("Zagreb");
        


        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(varosok);


        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
        torolElemet(varosok, "Sarajevo");

        
        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(varosok);


        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont
        HashMap<String, String> fovarosok = new HashMap<>();


        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont
        fovarosok.put("Wien", "Österreich");
        fovarosok.put("Budapest", "Magyarország");
        fovarosok.put("Ljubljana", "Slovenija");


        // Írasd ki a főváros, ország párokat!
        // 1 pont
        System.out.println(fovarosok);


        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
        System.out.println(fovarosOrszaga(fovarosok, "Budapest"));


        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        System.out.println(fovarosOrszaga(fovarosok, "Budapest"));


        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
        ujFovarosOrszagPar(fovarosok, "Zagreb", "Hrvatska");


        // A torolAdatPart() metódussal törld a "Ljubljana" főváros ország párt
        // 1 pont
        torolAdatPart(fovarosok, "Ljubljana");


        // A torolAdatPart() metódussal törld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont


        // Írasd ki a főváros, ország párokat!
        // 1 pont
        System.out.println(fovarosok);

    }
    public static void torolElemet(ArrayList<String> list, String elem) {
        list.remove(elem);
    }

    public static void torolAdatPart(HashMap<String, String> countries, String capital) {
        if (countries.containsKey(capital)) {
            countries.remove(capital);
        } else {
            throw new IllegalArgumentException("Nincs " + capital + " főváros az adatok között");
        }
    }


    public static void ujElemHozzaadasa(ArrayList<String> list, String elem) {
        list.add(elem);
    }

    public static String fovarosOrszaga(HashMap<String, String> countries, String capital) {
        return countries.getOrDefault(capital, capital + " nincs az adatok között.");
    }
    

    public static void ujFovarosOrszagPar(ArrayList<String>varosok) {
        varosok.add("Zagreb");
        varosok.add("Hrvatska");
    }

    public static void torolAdatPart(ArrayList<String>varosok) {
        varosok.remove("Ljubljana");
    }

    public static void ujFovarosOrszagPar(HashMap<String, String> countries, String capital, String country) {
        countries.put(capital, country);
    }

    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont
    


    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont


    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    // 3 pont


    /**
     * ujFovarosOrszagPar() - A coutries-hoz hozzáadja a főváros ország (capital country) párt.
     * @param coutries a főváros ország párok
     * @param capital a főváros neve
     * @param country az ország neve
     */
    // 3 pont


    /**
     * A coutries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
     * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
     * @param coutries a főváros ország adatpárok
     * @param capital a főváros neve
     * @throws IllegalArgumentException
     */
    // 5 pont


}
