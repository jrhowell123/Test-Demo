import static org.junit.Assert.*;
import org.junit.*;

public class TestDemoTest {
    @Test
    public void subtraction(){
        assertEquals(2, TestDemo.subtract(3,1));//should pass
    }

    @Test
    public void multiplication(){
        assertEquals(6, TestDemo.subtract(3,2));//should pass
    }
}
