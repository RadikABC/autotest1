package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainAmount900() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemainAmount1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemainAmount999() {
        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemainAmount1001() {
        int amount = 1001;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemainAmount0() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}