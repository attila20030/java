import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int szam = 0;

        for(int i = 0;i < arr.length;i++){
            szam += arr[i];
        }
        int avg = szam/arr.length;
        System.out.println("A tömb Átlaga: " + avg);

        sc.close();

    }
}
