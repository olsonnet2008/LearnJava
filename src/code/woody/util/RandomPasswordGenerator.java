package code.woody.util;

import org.apache.commons.lang.RandomStringUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 *
 * Created by oliverwood on 09/07/2015.
 */
public class RandomPasswordGenerator {

    private String key = "bar12345bar12345";
    private byte[] encrypted = null;

    public String generatePassword(){
        String genPwd = RandomStringUtils.randomAlphanumeric(8);
        System.out.println(genPwd);
        return genPwd;
    }

    public String encryptPassword(String pwd){

        String encString = "";

        try {
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            encrypted = cipher.doFinal(pwd.getBytes());
            encString = new String(encrypted);
            System.out.println(encString);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return encString;
    }

    public String decryptPassword(String encPwd){
        String decrypted = "";
        try {
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            decrypted = new String(cipher.doFinal(encrypted));
            System.out.println(decrypted);
        }
        catch(Exception exception){
            exception.getStackTrace();
        }
        return decrypted;
    }

    public static void main(String[] args) {
        System.out.println("Random Password Generator");
        RandomPasswordGenerator rpg = new RandomPasswordGenerator();
        String pwd = rpg.generatePassword();
        String encPwd = rpg.encryptPassword(pwd);
        rpg.decryptPassword(encPwd);

    }
}
