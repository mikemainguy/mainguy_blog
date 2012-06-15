package blog.mainguy;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class LookupEntity {
    private String name;
    public LookupEntity(String name) {
        this.name = name;
        hashCode = name.hashCode();
    }
    public String getName() {
        return name;
    }
    private int hashCode;

    @Override
    public boolean equals(Object other) {
        try {
            return this.name.equals(((LookupEntity)other).getName());
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return hashCode;
    }
}
