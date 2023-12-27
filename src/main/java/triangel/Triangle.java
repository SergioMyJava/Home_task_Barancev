package triangel;

public class Triangle {
    private double sizeA;
    private double sizeB;
    private double sizeC;

    public Triangle(double sizea, double sizeb, double sizec) {
        sizeA = sizea;
        sizeB = sizeb;
        sizeC = sizec;
    }

    public double getArea(){
        double per=perimeter ();
        return (Math.sqrt((per/2)*(per/2-sizeA)*(per/2-sizeB)*(per/2-sizeC)));
    }

    public double perimeter (){
        return (sizeA+sizeB+sizeC);
    }

}
