package wathis;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final PrintStream systemOut = System.out;

    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @Test
    public void testHelloWorld() {
        String helloWorld = "Hello World! ©Florian Le Menn  2019\n";
        App.main(null);
        Assert.assertEquals(helloWorld,testOut.toString());
    }

    @Test
    public void testApp() {
        App app = new App();
        Assert.assertNotNull(app);
    }

    @After
    public void restoreSystemOutput() {
        System.setOut(systemOut);
    }
}
