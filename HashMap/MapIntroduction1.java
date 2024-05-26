import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {

        //We are going to play with maps. Feel free to use the built-in methods where possible.
        //
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer,String> Map = new HashMap<>();

        //Print out whether the map is empty or not
        boolean Ures_e =  Map.isEmpty();
        System.out.println(Ures_e);

        //Add the following key-value pairs to the map
        //97 : a, 98 : b, 99 : c, 65 : A, 66 : B, 67 : C
        Map.put(97, "a");
        Map.put(98, "b");
        Map.put(99, "c");
        Map.put(65, "A");
        Map.put(66, "B");
        Map.put(67, "C");

        //Print all the keys
        System.out.println(Map.keySet());

        //Print all the values
        System.out.println(Map.values());

        //Add value D with the key 68
        Map.put(68,"D");

        //Print how many key-value pairs are in the map
        System.out.println(Map.size());

        //Print the value that is associated with key 99
        System.out.println(Map.get(99));

        //Remove the key-value pair with key 97 and print the associated value
        System.out.println(Map.remove(97));

        //Print whether there is an associated value with key 100 or not
        System.out.println(Map.containsKey(100));

        //Remove all the key-value pairs
        Map.clear();

        //Print how many key-value pairs are in the map
        System.out.println(Map.size());


    }

    // Output:
    // true
    // [97, 65, 98, 66, 99, 67]
    // [a, A, b, B, c, C]
    // 7
    // c
    // a
    // false
    // 0

}
