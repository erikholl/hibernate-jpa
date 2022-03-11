package be.intecbrussel.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityMgr {
    private static final String PERSISTENCE_UNIT_NAME = "datasource";
    private static EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("datasource");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
