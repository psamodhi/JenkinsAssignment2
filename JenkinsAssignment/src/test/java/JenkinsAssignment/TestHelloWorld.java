package JenkinsAssignment;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelloWorld {

    @Test
    public void testHelloWorld() {
        assertEquals("hello world", Main.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        assertEquals(10, Main.getNumber10());
    }

}
