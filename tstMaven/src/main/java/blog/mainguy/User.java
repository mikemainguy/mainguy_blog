package blog.mainguy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * blog.mainguy.User: michaelmainguy
 * Date: 4/18/12
 * Time: 6:16 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "USER")
public class User  {

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Id
    private Integer id;
    @Column(name = "GIVENNAME")
    private String givenName;
    @Column(name = "FAMILYNAME")
    private String familyName;
    @Column(name = "TITLE")
    private String title;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
