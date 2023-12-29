package triangel;

import java.util.Arrays;

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

    public double getSizeA() {
        return sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    public double getSizeC() {
        return sizeC;
    }

    public double getArea(){
        double per=perimeter ();
        return (Math.sqrt((per/2)*(per/2-sizeA)*(per/2-sizeB)*(per/2-sizeC)));
    }

    public double perimeter (){
        return (sizeA+sizeB+sizeC);
    }

    @Override
    public boolean equals(Object o){
        if(this==o){
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triangle Triang = (Triangle) o;
        // я складываю стороны в два массива. Массивы сортирую и сравниваю

        double[] sidsFerstTriangel = {this.getSizeA(),this.getSizeB(),this.getSizeC()};
        Arrays.sort(sidsFerstTriangel);

        double[] sidsNextTriangel = {Triang.getSizeA(),Triang.getSizeB(),Triang.getSizeC()};
        Arrays.sort(sidsNextTriangel);

        if(Arrays.equals(sidsFerstTriangel,sidsNextTriangel)){
            return true;
        }
    else
        return false;
    }

}
