package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void shouldSuggest100ifPurchase900() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int purchase = 900;
        int actual = cashbackHackService.remain(purchase);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    void shouldSuggest500ifPurchase1500() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int purchase = 1500;
        int actual = cashbackHackService.remain(purchase);
        int expected = 500;

        assertEquals(actual, expected);

    }

    @Test
    void ifPurchase1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int purchase = 1000;
        int actual = cashbackHackService.remain(purchase);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    void ifPurchaseNull() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int purchase = 0;
        int actual = cashbackHackService.remain(purchase);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    void shouldSuggest1ifPurchase999() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int purchase = 999;
        int actual = cashbackHackService.remain(purchase);
        int expected = 1;

        assertEquals(actual, expected);

    }


    @Test
    void shouldSuggest999ifPurchase1001() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int purchase = 1001;
        int actual = cashbackHackService.remain(purchase);
        int expected = 999;

        assertEquals(actual, expected);

    }



}