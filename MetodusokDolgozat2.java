public class MetodusokDolgozat2 {
    /*public class MasodfokuEgyenletMegoldas {

        public static String masodfokuMegoldasSzam(double a,double b,double c) {
            if(a == 0)
            return "nem másodkofú függvény";
            else {
                double diszkriminans = b * b - 4 * a * c;
                if (diszkriminans > 0) {
                    return "két megoldása van"; 
                } else if (diszkriminans == 0) {
                    return " egy megoldása van"; 
                } else {
                    return "nincs megoldása"; 
                }
            }
        }
    }*/
    
    public static boolean vanKisbetu(String text) {
        for (char letter: text.toCharArray()) {
            if (Character.isLowerCase(letter)) return true;
        }
        return false;
    }

    public static String getMeret(double szam1) {
        if(szam1 < 150)
            return "XS";
        else if(szam1 >= 150 && szam1 < 160)
            return "S";
        else if(szam1 >= 160 && szam1 < 170)
            return "M";
        else if(szam1 >= 170 && szam1 < 180)
            return "L";
        else if(szam1 >= 180 && szam1 < 190)
            return "XL";
        else 
            return "XXL";
    }

    public static String rubikKockaSzin(int number) {
        if(number == 1)
            return "yellow";
        else if(number == 2)
            return "red";
        else if(number == 3)
            return "orange";
        else if(number == 4)
            return "white";
        else if(number == 5)
            return "blue";
        else if(number == 6)
            return "green";
        else 
            return "invalid parameter";
    }
}
