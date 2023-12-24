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
}
