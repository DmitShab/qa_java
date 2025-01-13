import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }
    @Test
    public void getSoundShouldReturnMeow(){
        String expected = "Мяу";
        Assert.assertEquals("ОР: Мяу", expected, cat.getSound());
    }
    @Test
    public void getFoodShouldReturnMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> expected= List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expected, cat.getFood());

    }
}