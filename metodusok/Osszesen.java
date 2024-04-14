public class Osszesen{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy egész számot: ");
        int szam1 = sc.nextInt();

        int ossze = ossze(szam1);

        System.out.println("Az összeg: " + ossze);

        sc.close();
    }

    public static int ossze(int szam1){
        int ossze = 0;
        for(int i = 0; i <= szam1;i++){
            ossze += i;
        }
        return ossze;
    }
}
