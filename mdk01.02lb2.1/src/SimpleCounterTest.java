import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCounterTest {

    private SimpleCounter myycounter1;
    static int totalChanges;

    @BeforeAll
    static void test_1() {
        totalChanges = 0;
        System.out.println("начало тестов = 0");
    }

    @BeforeEach
    void test_2() {
    myycounter1 = new SimpleCounter(10, 2);
    }

    @AfterEach
    void test_3() {
        totalChanges++;
        System.out.println("счетчик: " + totalChanges);
    }

    @AfterAll
    static void test_4_end() {
        System.out.println("итог: " + totalChanges);
    }

    @Test
    @DisplayName("проверка начального значения")
    void test_11() {
        assertEquals(10, myycounter1.getCount());
    }

    @Test
    @DisplayName("проверка инкремента +2")
    void test_111() {
        myycounter1.increment();
        assertEquals(12, myycounter1.getCount());
    }
    @Test
    @DisplayName("проверка декремента -2")
    void test_1111() {
        myycounter1.decrement();
        assertEquals(8, myycounter1.getCount());
    }
}