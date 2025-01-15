import com.example.BigCats;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LionExceptionTest {

    private BigCats feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();

    }

    @Test
    public void testInvalidSexThrowsException() {
        try {
            new Lion("Fish", feline);
            Assert.fail("Ожидаемое исключение не было выброшено");
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}

