import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void calculo() {
        Calculadora cal = new Calculadora();
        String a = cal.Calculo("1 2 + 4 * 3 +");
        assertEquals("resultado 15.0", a);

    }
}