import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Mytest {

    @Test
    public void hello(){
        List<Integer> list =new ArrayList();
        list.add(1);
        list.add(5);
        list.add(7);
        for (int num : list) {
            System.out.println(num);
        }
        System.out.println("hello");

    }
}
