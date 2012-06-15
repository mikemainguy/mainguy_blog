package blog.mainguy;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: michaelmainguy
 * Date: 4/23/12
 * Time: 6:50 PM
 * To change this template use File | Settings | File Templates.
 */

@Component
public class UserDao extends HibernateDaoSupport {
    public UserDao() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        Properties p = new Properties();
        p.setProperty("hibernate.dialect","org.hibernate.dialect.HSQLDialect");
        this.setSessionFactory((SessionFactory)sessionFactory);

    }
    @Autowired
    public void setDataSource(DataSource datasource) {

        //this.sessionFactory.setDataSource(datasource);

        //sessionFactory.setHibernateProperties(p);

    };



}
