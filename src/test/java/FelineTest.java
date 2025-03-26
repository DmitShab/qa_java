import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatShouldReturnHunter() throws Exception {
         feline.eatMeat();
         Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void getFamilyShouldReturnFeline(){
        String expected = "Кошачьи";
    Assert.assertEquals("Должно вернуться - Кошачьи",expected, feline.getFamily());
    }
    @Test
    public void getKittensShouldReturnParameterValue(){
        int expected = 1;
        Assert.assertEquals("Метод должен вернуть 1 котенка", expected, feline.getKittens(1));
    }
    @Test
    public void getKittensWithoutParameter(){
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}
