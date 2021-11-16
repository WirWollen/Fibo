import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayLogicTest {
    @Test
    public void elementCollectionAvailability(){
        int a = 3;
        int b = 5;
        ArrayList<Numb> arrayList = new ArrayList<Numb>();
        Numb numb1 = new Numb();
        Numb numb2 = new Numb();

        numb1.setNumber(a);
        numb1.setNumber(b);
        arrayList.add(numb1);
        arrayList.add(numb2);

        Assert.assertEquals("size of collection must be 2", 2, arrayList.size());
    }

    @Test
    public void elementCollectionEmpty(){
        ArrayList<Numb> arrayList = new ArrayList<Numb>();

        Assert.assertEquals("collection must be empty", true, arrayList.isEmpty());
    }

    @Test
    public void givenNumbersOfValues(){
        int last = 10;
        ArrayList<Numb> arrayList = new ArrayList<Numb>(last);
        Sum sum = new Sum();
        Numb numb = new Numb();
        Numb numb1 = new Numb();

        numb.setNumber(0);
        arrayList.add(numb);
        numb1.setNumber(1);
        arrayList.add(numb1);

        for(int i = 2; i < last; i++){
            Numb num = new Numb();
            num.setNumber(sum.sumInt(arrayList.get(i-2), arrayList.get(i-1)));
            arrayList.add(num);
        }

        Assert.assertEquals("size of collection must be 10", 10, arrayList.size());
    }

    @Test
    public void checkingTheEight(){
        int last = 10;
        ArrayList<Numb> arrayList = new ArrayList<Numb>(last);
        Sum sum = new Sum();
        Numb numb = new Numb();
        Numb numb1 = new Numb();

        numb.setNumber(0);
        arrayList.add(numb);
        numb1.setNumber(1);
        arrayList.add(numb1);

        for(int i = 2; i < last; i++){
            Numb num = new Numb();
            num.setNumber(sum.sumInt(arrayList.get(i-2), arrayList.get(i-1)));
            arrayList.add(num);
        }

        Assert.assertEquals("the eighth must be 13", 13, arrayList.get(7).getNumber());
    }

    @Test
    public void collectionEntry(){
        int last = 20;
        ArrayList<Numb> arrayList = new ArrayList<Numb>(last);
        Sum sum = new Sum();
        Numb numb = new Numb();
        Numb numb1 = new Numb();

        numb.setNumber(0);
        arrayList.add(numb);
        numb1.setNumber(1);
        arrayList.add(numb1);

        for(int i = 2; i < last; i++){
            Numb num = new Numb();
            num.setNumber(sum.sumInt(arrayList.get(i-2), arrayList.get(i-1)));
            arrayList.add(num);
        }

        ArrayList<Numb> arrayListTest = new ArrayList<Numb>();
        Numb numb_0, numb_1, numb_2;
        int counter = 0;

        numb_0 = numb;
        numb_1 = numb1;
        numb_2 = arrayList.get(2);

        arrayListTest.add(numb_0);
        arrayListTest.add(numb_1);
        arrayListTest.add(numb_2);

        for (int i = 0; i < arrayListTest.size(); i++){
            for(int j = 0; j < arrayList.size(); j++){
                if(arrayList.get(i) == arrayListTest.get(j)){
                    counter++;
                    break;
                }
            }
        }

        Assert.assertEquals("Collection entry must be 3", arrayListTest.size(), counter);
    }

}
