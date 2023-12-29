package triangel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        Triangle test1 = new Triangle(9,4,6);
//        System.out.println(test1.perimeter());
//        int[] a ={2,3,4};
//        int[] b ={3,2,4};
//        Arrays.sort(a);
//        Arrays.sort(b);
//        System.out.println(Arrays.equals(a,b));

        var v1 = new Triangle(3,2,4);
        var v2 = new Triangle(3,4,2);
        //Assertions.assertTrue(v2.equals(v1));
        v1.equals(v2);
    }
}
