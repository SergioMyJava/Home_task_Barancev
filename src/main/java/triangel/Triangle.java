package triangel;

public class Triangle {
    private static double sizeA;
    private static double sizeB;
    private static double sizeC;

    public Triangle(double sizea, double sizeb, double sizec) {
        sizeA = sizea;
        sizeB = sizeb;
        sizeC = sizec;
    }

    public static double getArea(){
        double per=perimeter (sizeA, sizeB, sizeC);
        return (Math.sqrt(per*(per-sizeA)*(per-sizeB)*(per-sizeC)));
    }

    public static double perimeter (double sizeA, double sizeB,double sizeC){
        return (sizeA+sizeB+sizeC)/2;
    }
}
