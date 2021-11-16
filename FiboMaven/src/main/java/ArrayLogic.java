import lombok.Data;

import java.util.ArrayList;

@Data
public class ArrayLogic {
    private int last;
    private ArrayList<Numb> arrayList = new ArrayList<Numb>(last);
    private Sum sum = new Sum();
    private Numb numb = new Numb();
    private Numb numb1 = new Numb();

    public ArrayLogic(int last) {
        this.last = last;
    }

    public void initialize(){
        numb.setNumber(0);
        arrayList.add(numb);
        numb1.setNumber(1);
        arrayList.add(numb1);

        for(int i = 2; i < last; i++){
            Numb num = new Numb();
            num.setNumber(sum.sumInt(arrayList.get(i-2), arrayList.get(i-1)));
            arrayList.add(num);
        }
    }
    public void seeAll(){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).getNumber());
        }
    }





}
