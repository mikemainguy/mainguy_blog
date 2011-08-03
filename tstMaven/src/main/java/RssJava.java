import com.sun.syndication.feed.synd.*;
import com.sun.syndication.io.*;
import java.net.URL;
import java.util.List;

public class RssJava {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int total = 0;
        int entries = 0;

        try {
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed synFeed = input.build(new XmlReader(new URL("http://mikemainguy.blogspot.com/feeds/posts/default")));
            for (SyndEntry entry : (List<SyndEntry>) synFeed.getEntries()) {
                entries++;
                List<SyndContent> contents = entry.getContents();
                for (SyndContent content : contents) {
                    total += content.getValue().split(" ").length;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(total + "/" + entries + "=" + total/entries);
        System.out.println((float)(System.currentTimeMillis()-start) / 1000.0);
    }
}