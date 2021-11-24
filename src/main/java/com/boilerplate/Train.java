package com.boilerplate;

import java.util.LinkedList;
import java.util.List;

public class Train {
    public List<Person> people;
    public List<Station> stations;

    public Train() {
        this.people = new LinkedList<>();
        this.stations = new LinkedList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
