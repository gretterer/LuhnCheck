package LuhnCheck;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LuhnCheckTest {

    @Test
    public void cardResultPass() {

        long testpass;
        testpass = 4111111111111111L;

        LuhnChecker LuhnCheck = new LuhnChecker();

        String pass;
        pass = LuhnCheck.CardResult(testpass);

        assertEquals(pass, "This card appears valid");


    }


    @Test
    public void cardResultFail() {

        long testfail;
        testfail = 4222222222222222L;

        LuhnChecker LuhnCheck = new LuhnChecker();

        String fail;
        fail = LuhnCheck.CardResult(testfail);

        assertEquals(fail, "This card is not valid");


    }
}