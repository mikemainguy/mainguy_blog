import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * blog.mainguy.User: michaelmainguy
 * Date: 5/11/11
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class XmlJava {
    public static void main(String[] args){
        try {
            long start = System.currentTimeMillis();
            StringBuilder b = new StringBuilder();
            Document d = null;
            for (int i =0; i < 1; i++) {

                FileInputStream f = new FileInputStream(new File("data/test_file.xml"))     ;
                DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                d = db.parse(f);


                f.close();
            }
            for (int i =0; i< 100; i++) {
                b.append(d.getDocumentElement().getElementsByTagName("crow").item(0).getTextContent());
            }

            System.out.println(System.currentTimeMillis()- start + b.toString());
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
