package com.mtgdeckshot.persistence;

import com.mtgdeckshot.entity.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CardDaoTest {

    CardDao dao;

    final String CARD_NAME_1 = "Island";

    @Before
    public void setup() {
        dao = new CardDao();
    }

    @Test
    public void testGetCardById() {
        Card testCard = dao.getCard(0);
        assertTrue(testCard != null);
    }

    @Test
    public void testGetCardByName() {
        Card testCard = dao.getCard(CARD_NAME_1);
        assertTrue(testCard != null);
        assertTrue(testCard.getName().equals(CARD_NAME_1));
    }



}
