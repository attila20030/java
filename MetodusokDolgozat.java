public class MetodusokDolgozat {
    public static void signOfTheNumber(int szam1) {
        int result = 0;
        if(szam1 > 0)
        result =  1;
        else if(szam1 > 0){
            result = -1;
        }
        else{
            result = 0;
        }
        
    }
    public static void twoParameters(String[] args) {
        System.out.println(twoParameters("the meaning of life", 42));
    }

    public static String twoParameters(Object parameter1, Object parameter2) {

        String param1String = String.valueOf(parameter1);
        String param2String = String.valueOf(parameter1);


        String result = "first parameter: " + param1String + ", second parameter: " + param2String;

        return result;
    }


    public static void triangleArea(int szam2,int szam3,int szam4) {

    }


    public static void secondDegreeFunction(double a, double b, double c) {
        if (a == 0) {
            System.out.println("nem masodfoku a fuggveny");
            return;
        }

        double diszkriminans = b * b - 4 * a * c;

        if (diszkriminans > 0) {
            double x1 = (-b + Math.sqrt(diszkriminans)) / (2 * a);
            double x2 = (-b - Math.sqrt(diszkriminans)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (diszkriminans == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("nincs valos megoldas");
        }
    }
}
