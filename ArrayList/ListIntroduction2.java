import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        //Create a list ('List A') which contains the following values
        // Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> lista_A = new ArrayList<String>();
        lista_A.add("Apple");
        lista_A.add("Avocado");
        lista_A.add("Bluberries");
        lista_A.add("Durian");
        lista_A.add("Lychee");

        //Create a new list ('List B') with the values of List A
        ArrayList<String> lista_B = new ArrayList<String>(lista_A);

        //Print out whether List A contains "Durian" or not
        System.out.println(lista_A.contains("Durian"));
        
        //Remove "Durian" from List B
        lista_B.remove("Durian");

        //Add "Kiwifruit" to List A after the 4th element
        lista_A.add(4,"Kiwifruit");

        //Compare the size of List A and List B
        System.out.println(lista_A.size() == lista_B.size());


        //Get the index of "Avocado" from List A
        System.out.println(lista_A.indexOf("Avocado"));

        //Get the index of "Durian" from List B
        System.out.println(lista_A.indexOf("Durian"));

        //Add "Passion Fruit" and "Pomelo" to List B in a single statement
        lista_B.addAll(List.of("Passion Fruit","Pomelo"));
        //Print out the 3rd element from List A
        System.out.println(lista_A.get(2));

        //Print all elements of List A
        System.out.println(lista_A);


        //Print all elements of List B
        System.out.println(lista_B);


        // Output:
        //true
        //false
        //1
        //-1
        //Blueberries
        //[Apple, Avocado, Blueberries, Durian, Kiwifruit, Lychee]
        //[Apple, Avocado, Blueberries, Lychee, Passion Fruit, Pomelo]
    }
}
