import org.junit.Test;
import static org.junit.Assert.*;

public class myUnitTest {

    @Test
    public void testAdd(){
        simpleMath math = new simpleMath();

        int result = math.add(2,4);

        assertEquals(6, result);

    }
}