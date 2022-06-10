package com.badrul.strutslearning;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Hello Struts User";
    }

    public String toString() {
        return message + " (from toString)";
    }
}
