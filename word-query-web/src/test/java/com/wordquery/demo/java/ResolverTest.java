package com.wordquery.demo.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

public class ResolverTest {

    @Test
    public void resolveWord() {
        assertEquals("aa",Resolver.resolveWord("aa."));
        assertEquals(";aa",Resolver.resolveWord(";aa."));
        assertEquals("",Resolver.resolveWord(""));
    }
}