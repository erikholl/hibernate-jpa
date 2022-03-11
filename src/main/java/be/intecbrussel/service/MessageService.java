package be.intecbrussel.service;

import be.intecbrussel.data.MessageDAO;

public class MessageService {

    private MessageDAO messageDao;

    public MessageService(MessageDAO messageDao) {
        this.messageDao = new MessageDAO();
    }
}
