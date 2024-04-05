package org.example.AutomationBasics;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100() {
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999() {
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999at1001() {
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

}
