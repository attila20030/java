import java.util.Scanner;

public class IFfeladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy számot: ");
        int szam1 = sc.nextInt();

        System.out.println("Kérem adja meg a második számot: ");
        int szam2 = sc.nextInt();

        System.out.println("Kérem adja meg a harmadik számot: ");
        int szam3 = sc.nextInt();

        if(szam1 > szam2 && szam1 > szam3){
            System.out.println("Az első szám a legnagyobb!");
        }

        else if(szam2 > szam1 && szam2 > szam3){
            System.out.println("A második szám a legnagyobb!");
        }

        else if(szam3 > szam1 && szam3 > szam2){
            System.out.println("A harmadik szám a legnagyobb!");
        }

        else if(szam1 < szam3 && szam1 > szam2){
            System.out.println("Az első szám a középső!");
        }

        else if(szam2< szam3 && szam2> szam1){
            System.out.println("A második szám a középső!");
        }

        else if(szam3 < szam2 && szam3 > szam1){
            System.out.println("A harmadik szám a középső!");
        }

        else if(szam1 < szam2 && szam1 < szam3){
            System.out.println("Az első szám a legkissebb");
        }

        else if(szam2 < szam1 && szam2 < szam3){
            System.out.println("A második szám a legkissebb!");
        }
        
        else{
            System.out.println("A harmadik szám a legkissebb!");
        }
    }
}
