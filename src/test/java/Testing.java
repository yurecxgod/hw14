import com.sun.org.slf4j.internal.LoggerFactory;
import hw14.MainApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

import static org.junit.Assert.assertArrayEquals;
@RunWith(Parameterized.class)
public class Testing {
    private static final java.util.logging.Logger log = Logger.getLogger(hw14.MainApp.class.getName());

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,5,4,3,7,2}, new int[]{1,7}, " 1"},
                {new int[]{7,3,5,8,2,1}, new int[]{1,3}, " 2"},
                {new int[]{4,2,9}, new int[]{2,9}, " 3"}
        });
    }

    private int[] arrOriginal;
    private int[] arrExpected;
    private String message;

    public void Testing(int[] arrOriginal, int[] arrExpected, String message) {
        this.arrOriginal = arrOriginal;
        this.arrExpected = arrExpected;
        this.message = message;
    }

    @Test
    public void Testing() {
        log.info(message+": отправили массив: "+ Arrays.toString(arrOriginal)+" получили массив: "+ Arrays.toString(arrExpected));
        assertArrayEquals("Заданный нами массив должен совпадать с полученным", arrExpected, MainApp.process(arrOriginal));
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionTask1() {
        log.info("Тест на появление RuntimeException");
        hw14.MainApp.process(new int[]{1,2,3});
    }
}
