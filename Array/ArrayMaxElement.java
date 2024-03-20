
public class ArrayMaxElement {
    public static void main(String[] args) {

        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int nagy = 0;
        for (int i = 1; i < arr.length; i++) {
        if (arr[i] >nagy) {
        nagy = arr[i];
        System.out.println("A legnagyobb szám a tömbben: " + arr[i]);
}   }
    }
}
