package com.badrul.strutslearning.action;

import com.badrul.strutslearning.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }

    public void validate() {
        if (StringUtils.isEmpty(personBean.getFirstName())) {
            addFieldError("personBean.firstName", "First name is required.");
        }
        if (StringUtils.isEmpty(personBean.getEmail())) {
            addFieldError("personBean.email", "Email is required.");
        }
        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }
}