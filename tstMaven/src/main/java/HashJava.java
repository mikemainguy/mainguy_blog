import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: michaelmainguy
 * Date: 6/2/11
 * Time: 8:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class HashJava {
    public static final void main(String[] args) {
        Map m = new HashMap();
        long start = System.currentTimeMillis();

        for (int i = 0; i< 1000; i++) {
            m.put(i.toString(), i.toString() + 1000);
        }
        System.out.println(System.currentTimeMillis()- start);
    }
}
