package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class sumAllElements_12 {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        //TODO..
        Iterator<Integer> it= arrayList.iterator();
        int add =0;
        while (it.hasNext()){
            add+=it.next();
        }
        return add;

    }
}
