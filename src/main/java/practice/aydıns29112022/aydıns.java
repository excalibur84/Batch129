package practice.aydıns29112022;

public class aydıns {public static void main(String[] args) {

    double dikdortgenAlan = areaRectangle(5, 10);
    System.out.println(dikdortgenAlan);

    long dikdortgenCevre = perimeterRectangle(5, 10);
    System.out.println(dikdortgenCevre);

    double daireCevre = perimeterCircle(10);
    System.out.println(daireCevre);

    double daireAlan = areaCircle(2);
    System.out.println(daireAlan);



}

    public static double areaRectangle(double a,double b){

        return  a*b;

    }

    protected static long perimeterRectangle(int a, int b){

        return 2*a + 2*b;

    }

    static double perimeterCircle(double r){

        int π = 3;

        return 2*π*r;

    }

    private static double areaCircle(double r){

        int π = 3;

        return π*r*r;

    }


}

