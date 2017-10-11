package com.mtgdeckshot.persistence;

import org.hibernate.Session;

public final class DaoUtil {

    public static Session openSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    public static void closeSession(Session session) {
        if(session != null) {
            session.close();
        }
    }
}
