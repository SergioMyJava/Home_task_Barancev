package triangel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsTriangel {

    @Test
    void cancalculateArea(){
        Assertions.assertEquals(9.56229574945264,Triangle.getArea(9,4,6));
        Assertions.assertEquals(34.197039345533994,Triangle.getArea(8,9,10));
    }
}
