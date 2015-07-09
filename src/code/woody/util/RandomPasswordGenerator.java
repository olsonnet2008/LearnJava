package code.woody.util;

import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * Created by oliverwood on 09/07/2015.
 */
public class RandomPasswordGenerator {

    public String generatePassword(){
        return RandomStringUtils.randomAlphanumeric(8);
    }

    public static void main(String[] args) {
        System.out.println("Random Password Generator");
        RandomPasswordGenerator rpg = new RandomPasswordGenerator();
        System.out.print(rpg.generatePassword());

    }
}
