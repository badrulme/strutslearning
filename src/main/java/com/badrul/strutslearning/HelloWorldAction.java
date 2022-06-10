package com.badrul.strutslearning;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    private static int helloCount = 0;

    public int getHelloCount() {
        return helloCount;
    }


    @Override
    public String execute() {
        messageStore = new MessageStore() ;
        helloCount++;

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
