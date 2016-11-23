package geco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginServiceTest {

    @Test
    public void testLoginExists() throws Exception {
        String[] s = {"liste"};
        LoginService test = new LoginService(s);
        assertEquals(test.loginExists("liste"), true);
    }

    @Test
    public void testAddLogin() throws Exception {
        String[] s = {"liste"};
        LoginService test = new LoginService(s);
        String l = "login";
        test.addLogin(l);
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        String[] s = {"liste"};
        LoginService test = new LoginService(s);
        String l = "login";
        test.findAllLoginsStartingWith(l);
    }

    @Test
    public void testFindAllLogins() throws Exception {
        String[] s = {"liste"};
        LoginService test = new LoginService(s);
        test.findAllLogins();
    }
}