public class AppendAFunc{
    public static void main(String[] args) {
        String[] tomb1 = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};
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

