public class AppendAFunc{
    public static void main(String[] args) {
        String[] tomb1 = {"Körte","Szőlő","Meggy","Dinnye"};
        String[] newArray = appendA(tomb1);
        
        
        for (String elemek: newArray) {
            System.out.println(elemek);
        }
    }
    
    public static String[] appendA(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += "a";
        }
        return array;
    }
}
