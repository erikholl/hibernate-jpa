package be.intecbrussel.view;

import be.intecbrussel.model.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "datasource");
        EntityManager em = emf.createEntityManager();

        Message msg = em.find(Message.class, 1);
        // very few lines of code to read an entry in the DB

        System.out.println(msg);
    }
}
