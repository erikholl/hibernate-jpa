package be.intecbrussel.main;

import be.intecbrussel.model.Module;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Play {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("datasource");
        EntityManager em = factory.createEntityManager();

        Module m = new Module();
        m.setModuleId(3);
        m.setModuleName("DFAM");
        m.setBrand("Moog");
        m.setWidthInHP(60);
        m.setDepthInMM(26);
        m.setPricePerUnit(new BigDecimal(565));
        m.setCurrentPlusTwelve(230);
        m.setCurrentMinTwelve(0);
        m.setCurrentPlusFive(0);
        m.setMainFunction("Oscillator");
        m.setSecondaryFunction1("Sequencer");
        m.setSecondaryFunction2("Filter");
        m.setSecondaryFunction3("Clock");
        m.setUrl("https://www.moogmusic.com/products/semi-modular/dfam-drummer-another-mother");

        em.persist(m);
        em.getTransaction().begin();
        em.getProperties().get("moduleId");
        em.getTransaction().commit();

        Module module = em.find(Module.class, 2);
        System.out.println(module);

        em.close();
    }
}
