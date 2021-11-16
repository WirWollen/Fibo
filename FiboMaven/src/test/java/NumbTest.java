import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//Подключить Makita
//Почитать assertThat

public class NumbTest {
    @Test
    public void setNum(){
        //Дано
        int a = 5;
        Numb numb = new Numb();

        //Если
        numb.setNumber(a);

        //Тогда
        //Сначала - ожидаемое
        //Потом - актуальное
        Assert.assertEquals(numb.getNumber(), a);
        //Assert.
    }
}
