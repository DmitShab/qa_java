import com.example.BigCats;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;


public class LionExceptionTest {

    private BigCats feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();

    }

    @Test(expected = Exception.class)
    public void lionTestsConstructorInvalidInput() throws Exception {
        Lion lion = new Lion("Fish", feline);
    }
}

