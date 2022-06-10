package com.badrul.strutslearning;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    private String userName;

    private static int helloCount = 0;

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();

        if (!StringUtils.isEmpty(userName)) {
            messageStore.setMessage(messageStore.getMessage() + " " + userName);
        }
        helloCount++;

        return SUCCESS;
    }

}
