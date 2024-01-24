import java.util.Scanner;

public class feladat2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kedvenc zeneszáma: ");
        String zene = scanner.nextLine();
        System.out.print("kedvenc étele: ");
        String etele = scanner.nextLine();
        System.out.print("kedvenc hobbija: ");
        String hobbi = scanner.nextLine();
        System.out.print("kedvenc hobbija: ");
        String film = scanner.nextLine();
        System.out.print("kedvenc uticélja: ");
        String uticel = scanner.nextLine();


        System.out.println("kedvenc zenéje: "+ zene);
        System.out.println("kedvenc étele: "+ etele);
        System.out.println("kedvenc hobbija: "+ hobbi);
        System.out.println("kedvenc filmje: "+ film);
        System.out.println("kedvenc uticélja: "+ uticel);


    }
}
