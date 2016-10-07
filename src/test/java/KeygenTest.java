import com.reviselabs.Keygen;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kevin on 10/7/2016
 */
public class KeygenTest {
    @Test
    public void testKeyGeneration() throws Exception {
        String key = Keygen.generate(Keygen.ALPHA, 64);
        assertEquals(key.length(), 64);
        System.out.printf("%s - ALPHA \n", key);

        key = Keygen.generate(Keygen.ALPHA_NUMERIC, 64);
        assertEquals(key.length(), 64);
        System.out.printf("%s - ALPHA_NUMERIC \n", key);

        key = Keygen.generate(Keygen.ALPHA_UPPER, 64);
        assertEquals(key.length(), 64);
        System.out.printf("%s - ALPHA_UPPER \n", key);

        key = Keygen.generate(Keygen.ALPHA_NUMERIC_SPECIAL, 64);
        assertEquals(key.length(), 64);
        System.out.printf("%s - ALPHA_NUMERIC_SPECIAL \n", key);

        key = Keygen.generate();
        assertEquals(key.length(), 64);
        System.out.printf("%s - No arg method \n", key);

        key = Keygen.generate("aksihdns88--".split(""));
        assertEquals(key.length(), 64);
        System.out.printf("%s - Provided library \n", key);

        key = Keygen.generate(32);
        assertEquals(key.length(), 32);
        System.out.printf("%s - Specified length \n", key);

        key = Keygen.generate("REVISELABS".split(""), 25);
        assertEquals(key.length(), 25);
        System.out.printf("%s - Custom Library \n", key);

    }
}
