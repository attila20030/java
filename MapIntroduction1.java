import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        //We are going to play with maps. Feel free to use the built-in methods where possible.
        //
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer,String> Capitalcities = new HashMap<Integer,String>();

        //Print out whether the map is empty or not
        System.out.println(Capitalcities.isEmpty());


        //Add the following key-value pairs to the map
        //97 : a, 98 : b, 99 : c, 65 : A, 66 : B, 67 : C
        Capitalcities.put(97,"a");
        Capitalcities.put(98,"b");
        Capitalcities.put(99 , "c");
        Capitalcities.put(65 , "A");
        Capitalcities.put(66 , "B");
        Capitalcities.put(67 , "C");
        

        //Print all the keys
        for(Map.Entry m : Capitalcities.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        
        //Print all the values
        for(Map.Entry m : Capitalcities.entrySet()){
            System.out.println(m.getValue());
        }

        //Add value D with the key 68
        Capitalcities.put(68,"D");

        //Print how many key-value pairs are in the map
        int size = Capitalcities.size();
        System.out.println(size);


        //Print the value that is associated with key 99
        String ertek = Capitalcities.get(99);
        System.out.println(ertek);

        //Remove the key-value pair with key 97 and print the associated value
        Capitalcities.remove(97,"a");

        //Print whether there is an associated value with key 100 or not
        boolean isKeyIn = Capitalcities.containsKey(100);
        System.out.println(isKeyIn);

        //Remove all the key-value pairs
        Capitalcities.clear();

        //Print how many key-value pairs are in the map
        int meret = Capitalcities.size();
        System.out.println(meret);




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
