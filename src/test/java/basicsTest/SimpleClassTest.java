package basicsTest;

import basics.SimpleClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleClassTest {

    @Test
    public void compare() {
        SimpleClass simpleClass = new SimpleClass();
        int num = simpleClass.compare(2, 1);
        Assertions.assertEquals(1, num);
    }
    @Test
    public void compare2() {
        SimpleClass simpleClass = new SimpleClass();
        int num = simpleClass.compare(1, 2);
        Assertions.assertEquals(-1, num);
    }
    @Test
    public void compare3() {
        SimpleClass simpleClass = new SimpleClass();
        int num = simpleClass.compare(2, 2);
        Assertions.assertEquals(0, num);
    }
    @Test
    public void sortArray() {
        SimpleClass simpleClass = new SimpleClass();
        int[] array = new int[]{3, 7, 1, 9, 4, 5, 2, -1, 0};
        simpleClass.sortArray(array);
        Assertions.assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4, 5, 7, 9}, array);
    }
}
