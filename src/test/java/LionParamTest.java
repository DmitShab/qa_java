import com.example.BigCats;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {


    private final String constructorParameter;
    private final boolean expected;
    private BigCats feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();

    }

    public LionParamTest(String constructorParameter, boolean expected) {
        this.constructorParameter = constructorParameter;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(constructorParameter, feline);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }
}


