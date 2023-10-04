package ru.alfabank.assesment;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import ru.alfabank.assesment.entities.Person;
import ru.alfabank.assesment.entities.Singer;
import ru.alfabank.assesment.tags.Link;

import java.util.List;

import static ru.alfabank.assesment.assertions.PersonAssert.assertThat;

public class CustomAssertionsTest {

    @Test
    @Description("Пример создания собственного Assert")
    @Link("https://www.baeldung.com/assertj-custom-assertion")
    public void canSetSurname(){
        List<String> songs = List.of("Santa", "Luchia");
        Person singer = new Singer("Ivanova", "Vika", songs);
        assertThat(singer).hasSurname("Ivanova");
    }
}
