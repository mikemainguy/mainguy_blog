package blog.mainguy;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: michaelmainguy
 * Date: 4/23/12
 * Time: 7:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Flight implements Auditable {
    public Date start;
    public String getAuditString() {
        return "done";
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Date finish;
    public long getDuration() {
        return finish.getTime() - start.getTime();
    }
}

