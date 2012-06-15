import scala.util.parsing.combinator.testing.Str;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: michaelmainguy
 * Date: 12/9/11
 * Time: 6:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionChaos {
    public static final void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Second Thing");
        myList.add("Second Thing");
        myList.add("First Thing");

        System.out.println(myList.size());

        for (String item : myList) {
            System.out.println(item);
        }

        System.out.println(myList.contains("Third Thing"));


        Set<String> mySet = new HashSet<String>();
        mySet.add("Second Thing");
        mySet.add("Second Thing");
        mySet.add("First Thing");

        System.out.println(mySet.size());

        for (String item : mySet) {
            System.out.println(item);
        }

        System.out.println(mySet.contains("Third Thing"));

        Map<String,String> myMap = new Hashtable<String,String>();
        myMap.put("a", "Second Thing");
        myMap.put("b", "Second Thing");
        myMap.put("c", "First Thing");

        System.out.println(myMap.get("a"));

        for (Map.Entry<String,String> entry: myMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }



    }
}
