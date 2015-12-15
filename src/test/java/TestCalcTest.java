import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by chszard on 2015. 12. 16..
 */
public class TestCalcTest{

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(30, calc.add(29, 1));
    }
}
