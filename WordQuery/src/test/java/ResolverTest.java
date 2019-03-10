import org.junit.Test;

import static org.junit.Assert.*;

public class ResolverTest {

    @Test
    public void resolveWord() {
        assertEquals("aa",Resolver.resolveWord("aa."));
        assertEquals(";aa",Resolver.resolveWord(";aa."));
    }
}