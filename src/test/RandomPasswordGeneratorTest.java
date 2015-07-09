package test;

import code.woody.util.RandomPasswordGenerator;
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

    protected String message;

    public RandomPasswordGeneratorTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        message = "Random Password Generator";
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testRandomPasswordGeneratorMessage()
    {
        System.out.println("In test RandomPasswordGeneratorMessage");
        assertEquals(message, "Random Password Generator");
    }

    public void testRandomPasswordGeneratorLength(){
        System.out.println("In test RandomPasswordGeneratorLength");
        RandomPasswordGenerator rpg = new RandomPasswordGenerator();
        assertEquals(8,rpg.generatePassword().length());
    }

    public void testRandomPasswordGeneratorEncryption(){
        System.out.println("In test RandomPasswordGeneratorEncryption");
        RandomPasswordGenerator rpg = new RandomPasswordGenerator();
        String pwd = rpg.generatePassword();
        assertNotSame(rpg.encryptPassword(pwd), pwd);
    }

    public void testRandomPasswordGeneratorDecryption(){
        System.out.println("In test RandomPasswordGeneratorDecryption");
        RandomPasswordGenerator rpg = new RandomPasswordGenerator();
        String pwd = rpg.generatePassword();
        String encPwd = rpg.encryptPassword(pwd);
        assertEquals(rpg.decryptPassword(encPwd), pwd);
    }

    public static Test suite() {
        return new TestSuite(RandomPasswordGeneratorTest.class);
    }
}
