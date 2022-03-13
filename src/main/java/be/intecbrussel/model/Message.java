package be.intecbrussel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // with this we declare this class to be a Data-Class
public class Message {

     // @Id declare primary key; @GeneratedValue auto-increment
    @Id @GeneratedValue private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }

    // @Id >> sets a variable as primary key in the DB
    // @GeneratedValue >> auto generated id
    // what happens when Id is set as auto generated? a 2nd table will be
    // generated 'hibernate...' which stores the next value
    // it is NOT possible anymore to provide an Id with a setter!
    // Object Identity: has to do with object reference... ( == )
    // Object Equality: has to do with the object state... (.equals)
    // Database Identity: has to do with Primary Key

    // message read from DB:    { id: 1, message: 'Hello World' }
    // message after:           { id: 1, message: 'Hello Pluto' }
    // >> state differs, identity is the same

    // .persist(x) >> works with new objects / records. In other words, we
    // cannot use persist when trying to update a record with an Id x.
    // how to update? 2 ways:
    // 1. get the object from DB - set new value - ...begin and ...commit
    // 2. .merge(x): merge works with existing objects

    // make new order
    // save to DB (.persist)
    // update order (change something in it, .merge)
    // remove (.remove)
}
