import org.junit.Test;

import static org.junit.Assert.*;

public class JudgerTest {
    @Test
    public void isNum() {
        assertEquals(true,Judger.isNum("2013"));
        assertEquals(false,Judger.isNum("201a"));
    }

    @Test
    public void isNew() {
        assertEquals(true,Judger.isNew("2013"));
        assertEquals(false,Judger.isNew("201"));
    }
}