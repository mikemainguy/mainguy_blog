/**
 * Created by IntelliJ IDEA.
 * blog.mainguy.User: michaelmainguy
 * Date: 12/16/11
 * Time: 6:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlogPost {
    public BlogPost(String inString) {
       text = inString;
    }
    public String text = "";
    public static BlogPost latest;
    public static BlogPost create(String input) {
        latest = new BlogPost(input);
        return latest;
    }
    public static int getTextSize(BlogPost myPost) {
       return myPost.text.length();
    }
}
