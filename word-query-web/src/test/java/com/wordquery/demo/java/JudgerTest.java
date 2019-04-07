package com.wordquery.demo.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

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