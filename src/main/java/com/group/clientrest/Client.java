package com.group.clientrest;

/**
 * @author afsilva
 */
public class Client {

    private String firstName;
    private String lastName;
    private String sex;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() { return lastName; }

    public String getSex() {
        return sex;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) { this.sex = sex; }

}
