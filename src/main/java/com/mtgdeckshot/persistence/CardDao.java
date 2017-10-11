package com.mtgdeckshot.persistence;

import com.mtgdeckshot.entity.Card;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CardDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Get a card by its id.
     * @param id to be retrieved
     * @return populated Card
     */
    public Card getCard(int id) {
        Card card = null;
        Session session = null;
        try {
            session = DaoUtil.openSession();
            card = (Card)session.get(Card.class, id);
        } catch (HibernateException he) {
            log.error("Error getting card info for id: " + id, he);
        } finally {
            DaoUtil.closeSession(session);
        }

        return card;
    }

    /**
     * Get a card by an exact name match.
     * @param name to be searched by
     * @return populated Card
     */
    public Card getCard(String name) {
        Card card = null;
        Session session = null;
        try {
            session = DaoUtil.openSession();
            card = (Card)session.createCriteria(Card.class)
                    .add(Restrictions.eq("name", name))
                    .list().get(0);
        } catch (HibernateException he) {
            log.error("Error getting card info for name: " + name, he);
        } finally {
            DaoUtil.closeSession(session);
        }

        return card;
    }


}
