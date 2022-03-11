package be.intecbrussel.data;

import be.intecbrussel.model.Color;

import javax.persistence.EntityManager;

public class ColorDAO {
    private EntityManager em;

    public ColorDAO() {
        this.em = EntityMgr.getEntityManager();
    }

    public void addColor(Color c) {
        em.persist(c);
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
