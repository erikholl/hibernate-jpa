package be.intecbrussel.main;

import be.intecbrussel.model.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // JPA - Java Persistence API
        // Persistence - to persist - continued existence
        // in Java - save data to database
        // API - Application Programming Interface - a bundle of rules on how
        // to use a system/part of a system - Specification (JDBC) <>
        // Implementation (mysql-driver)
        // RuntimeException >> "No suitable driver found"

        // JPA - Hibernate: JPA is a specification, Hibernate is its
        // implementation.
        // JPA - Hibernate are ORMs >> Object Relational (DB) Mapping
        // Classes <> Tables

        // So far we did: Connection Application <> DB. We performed manual
        // mapping between Class and DB, field per field.
        // Now we're going to perform, with JPA:
        // Mapping      Order class <> order_table table
        // Mapping      Product class <> order_product table

        // How are we going to do that?
        // dependency hibernate and mysql-connector-java
        // create a directory 'META-INF' under Resources
        // create a file 'persistence.xml' in the META-INF directory
        // in the persistence file (a configuration file) we're going to
        // describe the connection we have with the DB:
        // persistence version
        // persistence unit, which we give a name (common is 'datasource')
        // assign properties to the persistence unit
            // property name: ...jdbc.url connection string to the DB
            // property name: username
            // property name: password
        // now we need an entity manager, similar to driver manager
        // EMF is similar to the JDBC connection
        // An EMF has a hibernate-connection pool (default 20?)
        // What is an entity?

        // Column           = Property
        // Record/Row       = Instance/Object
        // Table            = Data-Class
        // Entity           = Data-Class + Mapping Information

        // Questions
        // how to assign different properties to properties (for instance,
        // can be null, or cannot be null)

        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "datasource");
        EntityManager em = emf.createEntityManager();

        Message msg = new Message();
        msg.setId(1);
        msg.setMessage("hello DataBase");

        em.persist(msg);

        em.getTransaction().begin();
        em.getTransaction().commit();

        // few lines of code to add entry to DB. Difference though with JDBC
        // is that this program, with persistence, SQL queries need to be
        // created by the application itself, which will take time. JDBC is
        // faster
    }
}
