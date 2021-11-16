import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
    @Test
    public void sumInt(){
        //Дано
        int a = 13;
        int b = 21;
        Numb numbA = new Numb();
        Numb numbB = new Numb();
        numbA.setNumber(a);
        numbB.setNumber(b);
        Sum sum = new Sum();

        //Если
        int i = sum.sumInt(numbA, numbB);

        //Тогда
        Assert.assertEquals("13 + 21 must be equals 34", 34, i);
    }

}
