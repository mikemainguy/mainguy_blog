import blog.mainguy.LookupEntity;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LookupEntityTest {
    Set<LookupEntity> mySet = new HashSet<LookupEntity>();
    LookupEntity one;// = new LookupEntity();

    @Before
    public void setup() {
       // one.setName("mike");
        mySet.add(one);
    }

    @Test
    public void lookupTest() {
        assertFalse(mySet.contains(one));

    }

    @Test
    public void countTest() {
        mySet.add(one);
        assertEquals(2, mySet.size());


    }

    @Test
    public void hashCodeTest() {
        assertFalse(one.hashCode() == one.hashCode());
    }


}
