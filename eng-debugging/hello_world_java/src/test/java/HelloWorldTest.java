import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testCase1() throws IOException {
        // This test case is passing
        HelloWorld helloWorld = new HelloWorld("input/test_1.txt");
        String actualOutput = helloWorld.run();
        assertEquals("hello world\n", actualOutput);
    }

    @Test
    public void testCase2() throws IOException {
        // This test case is failing
        HelloWorld helloWorld = new HelloWorld("input/test_2.txt");
        String actualOutput = helloWorld.run();
        assertEquals("hello-world\n", actualOutput);
    }
}
