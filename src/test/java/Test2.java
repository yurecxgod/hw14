import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class Test2 {
    private static final java.util.logging.Logger log = Logger.getLogger(hw14.MainApp.class.getName());

    @Test
    public void testTask2AnotherNumb() {
        assertTrue("В массиве есть другие цифры", hw14.MainApp.process1(new int[]{1, 1, 4, 1, 4, 4, 1, 1, 4}));
        log.info("Массив только из 1 и 4");
    }

    @Test(expected = RuntimeException.class)
    public void testTask2Only1And4() {
        Assert.assertFalse("В массиве только 1 и 4", hw14.MainApp.process1(new int[]{1, 4, 2, 3}));
        log.info("В массиве не только 1 и 4");
    }

    @Test
    public void testTask2contains1() {
        Assert.assertFalse("В массиве есть 1", hw14.MainApp.process1(new int[]{4,4,4,4,4}));
        log.info("Массив только из 4");
    }

    @Test
    public void testTask2contains4() {
        Assert.assertFalse("В массиве есть 4", hw14.MainApp.process1(new int[]{1,1,1,1,1}));
        log.info("Массив только из 1");
    }
}
