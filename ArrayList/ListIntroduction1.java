import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //We are going to play with lists. Feel free to use the built-in methods where possible.
        //
        //Create an empty list which will contain names (strings)
        ArrayList<String> adatok = new ArrayList<String>();

        //Print out the number of elements in the list
        System.out.println(adatok.size());


        //Add "William" to the list
        adatok.add("William");


        //Print out whether the list is empty or not
        System.out.println(adatok.isEmpty());


        //Add "John" to the list
        adatok.add("John");


        //Add "Amanda" to the list
        adatok.add("Amanda");

        //Print out the number of elements in the list
        System.out.println(adatok.size());

        //Print out the 3rd element
        System.out.println(2);

        //Iterate through the list and print out each name
        for (String name : adatok) {
            System.out.println(name);
        }
        //Iterate through the list and print
        for (int i = 0; i < adatok.size(); i++) {
            System.out.println((i + 1) + ". " + adatok.get(i));
        }

        //Remove the 2nd element
        adatok.remove(1);

        //Iterate through the list in a reversed order and print out each name
        for (int i = adatok.size() - 1; i >= 0; i--) {
            System.out.println(adatok.get(i));
        }

        //Remove all elements
        adatok.clear();

        //Print out the number of elements in the list
        System.out.println(adatok.size());

        // Output:
        //0
        //false
        //3
        //Amanda
        //William
        //John
        //Amanda
        //1. William
        //2. John
        //3. Amanda
        //Amanda
        //William
        //0
    }
}
