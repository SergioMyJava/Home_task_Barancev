package triangel;

public class Triangle {
    private double sizeA;
    private double sizeB;
    private double sizeC;

    public Triangle(double sizea, double sizeb, double sizec) {
        if(sizea<0 || sizeb<0 || sizec<0){
            throw new IllegalArgumentException("Side cannot be negative");
        }
        if(sizea+sizeb<sizec || sizea+sizec<sizeb || sizec+sizeb<sizea){
            throw new IllegalArgumentException("The sum of the two sides must not be less than the third side.");
        }
        else {
            this.sizeA = sizea;
            this.sizeB = sizeb;
            this.sizeC = sizec;
        }
    }

    public double getArea(){
        double per=perimeter ();
        return (Math.sqrt((per/2)*(per/2-sizeA)*(per/2-sizeB)*(per/2-sizeC)));
    }

    public double perimeter (){
        return (sizeA+sizeB+sizeC);
    }

}
