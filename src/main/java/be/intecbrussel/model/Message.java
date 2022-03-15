package be.intecbrussel.model;

import javax.persistence.*;

@Entity
@Table (name = "message")
public class Message {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "msg", length = 42)
//    @Lob
    private String message;


    @ManyToOne // see explanation in PlayWithNotes class
    private User user;

//    @Lob
//    private byte[] digitalData;

    public User getUser() {
        return user;
    }

    public Message setUser(User user) {
        this.user = user;
        return this;
    }

    @Transient
    private String doNotSaveToDatabase;

    public int getId() {
        return id;
    }

    public Message setId(int id) {
        this.id = id;
        return  this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", user=" + user +
                ", doNotSaveToDatabase='" + doNotSaveToDatabase + '\'' +
                '}';
    }
}
