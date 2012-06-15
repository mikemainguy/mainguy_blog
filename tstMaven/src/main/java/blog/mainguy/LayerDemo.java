package blog.mainguy;

import blog.mainguy.User;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * blog.mainguy.User: michaelmainguy
 * Date: 4/18/12
 * Time: 9:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class LayerDemo {
    public static void  main(String[] args) {
        /*GenericApplicationContext context = new GenericApplicationContext();
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
        System.out.println(scanner.scan("blog.mainguy"));
        context.refresh();

        UserDao udao = (UserDao)context.getBean("UserDao");



        User u = new User();
        u.setFamilyName("MMike");
        u.setGivenName("Mainguy");
        u.setTitle("Mr.");   */

        //udao.getHibernateTemplate().save(u);
        save(new Flight());



    }
    public static void save(Flight f) {
        audit(f);
    }
    public static void audit(Auditable a) {
        System.out.println(a.getAuditString());
    }
}
