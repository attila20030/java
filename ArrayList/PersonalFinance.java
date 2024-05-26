import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    //We are going to represent our expenses in a list containing integers.
    //
    //Create a list with the following items:
    // 500, 1000, 1250, 175, 800 and 120
    //Create an application which prints out the answers to the following questions:
    // - How much did we spend?
    // - Which was our greatest expense?
    // - Which was our cheapest spending?
    // - What was the average amount of our spendings? (print this as a float value)
    //The full output of your main method should be the following:
    //
    //3845
    //1250
    //120
    //640.8333
    public static void main(Integer szam1) {
        List<Integer> money = new ArrayList<>();
        money.add(500);
        money.add(1000);
        money.add(1250);
        money.add(175);
        money.add(800);
        money.add(120);

        int osszes = 0;
        for(int number : money){
            osszes += money;
        }

        System.out.println(osszes);

        int max = Collections.max(money);
        System.out.println(max);

        int min = Collections.min(money);
        System.out.println(min);

        float atlag = (float) osszes / money.size();
        System.out.println(atlag);

        

    }

}
