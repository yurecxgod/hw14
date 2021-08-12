package hw14;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {
    private static final Logger log = Logger.getLogger(hw14.MainApp.class.getName());
    public static void main(String[] args) {
        final int[] res2 = process(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(Arrays.toString(res2));

        final boolean result = process1(new int[]{1, 1, 1, 1, 1});
        System.out.println(result);
    }

    public static int[] process(int[] arrIn) {
        int[] backArr = new int[2];
        if(arrIn.length == 0) {
            log.info("В массиве нет элементов");
            return arrIn;
        }
        for (int i = 0; i >= 0 ; i++) {
            if(arrIn[i] == 4) {
                System.arraycopy(arrIn, (i+1), backArr,0, 2);
                return backArr;
            }
        }
        throw new RuntimeException("В массиве нет ни одной 4-ки после которой были бы числа");
    }
    public static boolean process1(int[] arrIn) {
        boolean one = false;
        boolean four = false;
        for (int i: arrIn) {
            if(i != 1 && i!=4) throw new RuntimeException("invalid value");
            if(i == 1) one = true;
            if(i == 4) four = true;
        }
        return one && four;
    }
}
