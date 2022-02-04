import static org.junit.Assert.*;
import org.junit.*;

public class TestDemoTest {
    @Test
    public void subtraction(){
        assertEquals(2, TestDemo.subtract(3,3));
    }

    @Test
    public void multiplication(){
        assertEquals(6, TestDemo.subtract(3,3));
    }
}
