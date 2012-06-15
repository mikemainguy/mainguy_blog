package blog.mainguy;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: michaelmainguy
 * Date: 4/23/12
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MyDataSource extends DriverManagerDataSource {
    public MyDataSource() {
        this.setDriverClassName("org.hsqldb.jdbcDriver");
        this.setUrl("jdbc:hsqldb:~/test_db");
    }

}
