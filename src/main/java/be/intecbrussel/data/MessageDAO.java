package be.intecbrussel.data;

import javax.persistence.EntityManager;

public class MessageDAO {
    private EntityManager em;

    public MessageDAO() {
        this.em = EntityMgr.getEntityManager();
    }
}
