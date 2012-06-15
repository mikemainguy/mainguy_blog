import blog.mainguy.CostAuditResult;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: michaelmainguy
 * Date: 6/6/12
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class CostAuditResultTest {
    CostAuditResult result = new CostAuditResult();

    public void setupWrong() {
        result.setDays(new BigDecimal(365));
        result.setQuantity(new BigDecimal(83656));
        result.setAmount(new BigDecimal(10000.00));
    }

    @Test

    public void testCalcWrongAmount1() {
        setupWrong();
        assertEquals(2291900, result.getResultDouble());
    }

    @Test
    public void testCalcWrongAmount2() {
        setupWrong();
        assertEquals(2291900, result.getResultBigDecimal());
    }

    @Test
    public void testDivide() {
        setupWrong();
        assertEquals(new BigDecimal("229.19"), result.getQuantity().divide(result.getDays(),2,BigDecimal.ROUND_HALF_EVEN));
    }
}
