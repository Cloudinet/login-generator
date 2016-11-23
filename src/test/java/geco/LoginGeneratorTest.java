package geco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginGeneratorTest {

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        //String[] s = {"liste"};
        LoginService test = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator lg = new LoginGenerator(test);

        lg.generateLoginForNomAndPrenom("Paul", "Dupont");
        assertEquals(test.loginExists("PDUP"), false);
    }
}