package triangel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestsTriangel {
    Triangle test1;
    Triangle test2;

    @BeforeEach
    void init(){
        this.test1 = new Triangle(9,4,6);
        this.test2 = new Triangle(8,9,10);
    }


    @Test

    void cancalculateAreaOne(){
        Assertions.assertEquals(9.562,test1.getArea(), 0.001);
    }
    @Test
    void cancalculateAreaTwo(){
        Assertions.assertEquals(34.197,test2.getArea(), 0.001);
    }

    @Test
    void cancalculatePerimetrOne(){
        Assertions.assertEquals(19,test1.perimeter());
    }
    @Test
    void cancalculatePerimetrTwo(){
        Assertions.assertEquals(27,test2.perimeter());
    }

    @Test
    void cannotCreateTriangelWithNegativeSide(){
        try{
            new Triangle(10,3,3);
            Assertions.fail();
        }
        catch(IllegalArgumentException exception){
            System.out.println(exception);
        }
    }

    @Test
    void cannotCreateTriangelWithNoLessSide(){
        try{
            new Triangle(10,3,3);
            Assertions.fail();
        }
        catch(IllegalArgumentException exception){
            System.out.println(exception);
        }
    }
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @Test
    void equalseTriangel(){
            var v1 = new Triangle(3,2,4);
            var v2 = new Triangle(3,2,4);
            Assertions.assertTrue(v1.equals(v2));
    }

    @Test
    void notEqualseTriangele(){
        var v1 = new Triangle(3,2,4);
        var v2 = new Triangle(3,5,2);
        Assertions.assertFalse(v1.equals(v2));
    }

    @Test
    void withEqualseSideTriangel() {
        var v1 = new Triangle(3, 2, 4);
        var v2 = new Triangle(3, 4, 2);
        Assertions.assertTrue(v1.equals(v2));
    }
}
