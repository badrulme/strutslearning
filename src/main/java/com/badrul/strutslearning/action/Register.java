package com.badrul.strutslearning.action;

import com.badrul.strutslearning.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }


}