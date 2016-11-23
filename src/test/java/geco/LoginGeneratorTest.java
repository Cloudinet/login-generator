package geco;

import org.junit.Test;

public class LoginGeneratorTest {

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        String[] s = {"liste"};
        LoginService test = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator lg = new LoginGenerator(test);


    }
}