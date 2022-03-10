package be.intecbrussel.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // with this we declare this class to be a Data-Class
public class Message {

    @Id // declate the primary key of the Data-Class
    private int id;
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
}
