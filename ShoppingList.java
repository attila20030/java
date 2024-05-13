import java.util.LinkedList;


    //We are going to represent a shopping list by a list containing strings.
    //
    //Create a linked list with the following items:
    // eggs, milk, fish, apples, bread and chicken
    //Create an application which prints out the answers to the following questions:
    // - Do we have milk in the shopping list? (yes/no)
    // - Do we have bananas in the shopping list? (yes/no)
    //The full output of your main method should be the following:
    //
    //yes
    //no
    //
    // The question have to be a method.
public class ShoppingList {
    
    public static LinkedList<String> createShoppingList() {
        LinkedList<String> shopping = new LinkedList<>();
        shopping.add("eggs");
        shopping.add("milk");
        shopping.add("fish");
        shopping.add("apples");
        shopping.add("bread");
        shopping.add("chicken");
        return shopping;
    }
    
    public static String van_e(LinkedList<String> list, String resz) {
        return list.contains(resz) ? "yes" : "no";
    }

    public static void main(String[] args) {
        LinkedList<String> shoppingList = createShoppingList();
        
        // Check if milk is in the shopping list
        System.out.println(van_e(shoppingList, "milk"));
        
        // Check if bananas are in the shopping list
        System.out.println(van_e(shoppingList, "bananas"));
    }
}
