package be.intecbrussel.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityMgr {
    private static final String PERSISTENCE_UNIT_NAME = "datasource";

    public static EntityManager getEntityManager() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("datasource");
        javax.persistence.EntityManager em = factory.createEntityManager();
        return em;
    }
}
