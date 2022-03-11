package be.intecbrussel.data;

import be.intecbrussel.model.Module;

import javax.persistence.EntityManager;

public class ModuleDAO {
    private EntityManager em;

    public ModuleDAO()  {
        this.em = EntityMgr.getEntityManager();
    }

    public Module addModule(Module m) {
        em.persist(m);
        em.getTransaction().begin();
        em.getTransaction().commit();
        return m;
    }
}
