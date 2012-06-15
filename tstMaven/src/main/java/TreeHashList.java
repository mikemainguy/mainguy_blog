import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * blog.mainguy.User: michaelmainguy
 * Date: 12/9/11
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeHashList {
    public static final void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet<Integer>();

        ArrayList<Integer> al = new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            ts.add(Integer.valueOf(i % 1000));
        }
        System.out.println(System.currentTimeMillis() - start);

        for (int i = 0; i < 1000; i++) {
            ts.contains(Integer.valueOf(i % 1000));
        }
        int k = 0;
        for (int i = 0; i < 1000; i++) {
            for (Integer ii : ts) {
                k += ii.intValue();
            }

        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            if (!al.contains(i % 1000)) {
                al.add(Integer.valueOf(i % 1000));
            }

        }

        System.out.println(System.currentTimeMillis() - start);
        for (int i = 0; i < 1000; i++) {
            al.contains(Integer.valueOf(i % 1000));
        }
        for (int i = 0; i < 1000; i++) {
            for (Integer ii : al) {
                k += ii.intValue();
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(al.size());
        System.out.println(ts.size());


    }
}
