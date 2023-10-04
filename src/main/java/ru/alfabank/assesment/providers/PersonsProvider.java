package ru.alfabank.assesment.providers;

import lombok.experimental.UtilityClass;
import ru.alfabank.assesment.entities.Singer;

import java.util.List;

@UtilityClass
public class PersonsProvider {

    public Singer getSinger() {
        List<String> songs = List.of("Santa", "Luchia");
        return new Singer("Ivanova", "Vika", songs);
    }
}
