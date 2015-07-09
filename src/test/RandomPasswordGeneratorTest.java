package test;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
 * code.woody.util.RandomPasswordGenerator Tester.
 *
 * @author <Authors name>
 * @since <pre>07/09/2015</pre>
 * @version 1.0
 */
public class RandomPasswordGeneratorTest extends TestCase {
    public RandomPasswordGeneratorTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public static Test suite() {
        return new TestSuite(RandomPasswordGeneratorTest.class);
    }
}
