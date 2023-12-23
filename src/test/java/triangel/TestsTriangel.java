package triangel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsTriangel {




    @Test

    void cancalculateArea(){
        Triangle test1 = new Triangle(9,4,6);
        Assertions.assertEquals(9.56229574945264,test1.getArea());
        Triangle test2 = new Triangle(8,9,10);
        Assertions.assertEquals(34.197039345533994,test2.getArea());
    }
}
