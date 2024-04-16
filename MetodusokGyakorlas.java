

public class MetodusokGyakorlas {
    public static void szogElnevezes (double szog)  {
        String eredmeny = "";
        if(szog < 0)
            eredmeny = "Negatív szög";
        else if(szog == 0)
        eredmeny = "Nullszög";
        else if(szog > 0 && szog < 90)
        eredmeny = "Hegyesszög";
        else if(szog == 90)
        eredmeny = "Derékszög";
        else if(szog > 90 && szog < 180)
        eredmeny = "Tompaszög";
        else if(szog == 180)
        eredmeny = "Egyenesszög";
        else if(szog > 180 && szog < 360)
        eredmeny = "Homorúszög";
        else if(szog == 360)
        eredmeny = "Teljesszög";
        else 
        eredmeny = "nagyobb ,mint a teljesszög";
    }


    public static boolean hasEightTheSqrt(int num) {
        String result = "" + Math.sqrt(num);
        return result.contains("8");
    }

    public static boolean isValidPassword(String password) {
        int kisbetuszam = 0;
        int nagybetuszam = 0;
        int szamdb = 0;
        int specialisdb = 0;
        for (char x: password.toCharArray()) {
            if (Character.isLowerCase(x)) kisbetuszam++;
            if (Character.isUpperCase(x)) nagybetuszam++;
            if (Character.isDigit(x)) szamdb++;
            if (".-*#@!".contains("" + x)) specialisdb++;
        }
        return kisbetuszam > 1 && nagybetuszam > 1 && szamdb > 0 && specialisdb > 0;
    }

    public static String bodyMassIndexResult(double suly,double magassag) {
        double bmi = suly / (magassag * magassag);
        String result = "";
        if(bmi < 18.5) result = "Alacsony testsúly alatti kategória";
        if (bmi >= 18.5 && bmi < 25) result = "Normál testsúlyú kategória";
        if (bmi >= 25 && bmi < 30) result = "Túlsúlyos kategória";
        if (bmi >= 30 && bmi < 35) result = "Elhízás (I. fokú) kategória";
        if (bmi >= 35 && bmi < 40) result = "Elhízás (II. fokú) kategória";
        if (bmi >= 40) result = "Súlyos elhízás (III. fokú) kategória";
        return result; 
    }
}

