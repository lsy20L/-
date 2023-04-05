package com.lab1;

public class Reader{
    private String name;
    private String password;

    public Reader() {
    }

    public Reader(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Name:"+name+","+"Password:"+password;
    }
}
