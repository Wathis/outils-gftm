package wathis;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public void testHelloWorld() {
        String helloWorld = "Hello World! ©Florian Le Menn  2019";
        System.setOut(new PrintStream(outContent));
        System.out.print(helloWorld);
        assertEquals(helloWorld, outContent.toString());
        System.setOut(originalOut);
    }

    public void testApp() {

        App app = new App();
        assertNotNull(app);
    }
}
