import org.junit.jupiter.api.Test;

//error 3: Error:  Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:testCompile (default-testCompile) on project shipping-app: Compilation failure: Compilation failure: 
//Error:  /home/runner/work/Bai10/Bai10/src/test/java/ShippingCalculatorTest.java:[6,5] cannot find symbol
//Error:    symbol:   class ShippingCalculator 
//fix: import this: 
import com.lab.ShippingCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    ShippingCalculator calc = new ShippingCalculator();

    @Test
    void testStandard() {
        assertEquals(15000.0, calc.calculate(5, "STANDARD"));
    }

    @Test
    void testExpress() {
        assertEquals(45000.0, calc.calculate(5, "EXPRESS"));
    }

    @Test
    void testInvalidWeight() {
        assertThrows(IllegalArgumentException.class,
            () -> calc.calculate(-1, "STANDARD"));
    }
}
