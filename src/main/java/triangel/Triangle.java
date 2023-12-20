package triangel;

public class Triangle {


    public static double getArea(double sizeA, double sizeB,double sizeC){
        double per=perimeter (sizeA, sizeB, sizeC);
        return (Math.sqrt(per*(per-sizeA)*(per-sizeB)*(per-sizeC)));
    }

    public static double perimeter (double sizeA, double sizeB,double sizeC){
        return (sizeA+sizeB+sizeC)/2;
    }
}
