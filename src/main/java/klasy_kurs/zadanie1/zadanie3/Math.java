package klasy_kurs.zadanie1.zadanie3;

public class Math {
    public static double r;
    public static int a;
    public static int b;
    public static final double Pi = 3.14;

    public static double CountCircumferenceOfCircle(double r){
        double circle = 1;
        circle = 2*Pi*r;
        return circle;
    }

    public static double CountFieldOfCircle(){
        double circle = 1;
        circle = Pi*r*r;
        return circle;
    }

    public static int CountCircumferenceOfRectangle(int a, int b){
        int rectangle = 0;
        rectangle = 2*a+2*b;
        return rectangle;
    }
    public static int CoutFieldOfRetangle(int a, int b){
        int rectagle = 1;
        rectagle = a*b;
        return rectagle;
    }
}
