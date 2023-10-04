package ru.alfabank.assesment.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Singer extends Person {

    private final List<String> songs;

    public Singer(String surname, String firstName, List<String> songs){
        super(surname, firstName);
        this.songs = songs;
    }
}
