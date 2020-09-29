package pucrs.qp.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuelTest {
    @Test
    public void test(){
        int s = 10;
        int a = 85;
        double expected = 70.833;
        double result = Main.calculateFuel(s, a);
        result = Math.floor(result * 1000) / 1000;
        assertEquals(expected, result,0);
        
    }

}
