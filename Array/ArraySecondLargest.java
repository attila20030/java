public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        
        int legnagyobb = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > legnagyobb) {
                secondMax = legnagyobb;
                legnagyobb = arr[i];
            } else if (arr[i] > secondMax && arr[i] != legnagyobb) {
                secondMax = arr[i];
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Nincs második legnagyobb elem.");
        } else {
            System.out.println("A második legnagyobb elem: " + secondMax);
        }
    }
}
