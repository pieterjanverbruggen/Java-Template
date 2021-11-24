package com.boilerplate;

public class Person {
    private String name;
    private String destination;
    private String start;

    public Person(String name, String destination, String start) {
        this.name = name;
        this.destination = destination;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
