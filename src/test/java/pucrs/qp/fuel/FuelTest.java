package pucrs.qp.fuel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class FuelTest {
    @Test
    public void calculateFuel_Test(){
        int s = 10;
        int a = 85;
        double expected = 70.833;
        double result = Main.calculateFuel(s, a);
        result = Math.floor(result * 1000) / 1000;
        assertEquals(expected, result,0);
        
    }
    @Test
    public void calculateFuel_Test2(){
        int s = 10;
        int a = 86;
        double expected = 70.833;
        double result = Main.calculateFuel(s, a);
        result = Math.floor(result * 1000) / 1000;
        assertNotSame(expected, result);
    }

}
