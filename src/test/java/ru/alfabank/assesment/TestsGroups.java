package ru.alfabank.assesment;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import ru.alfabank.assesment.entities.Singer;
import ru.alfabank.assesment.providers.PersonsProvider;
import ru.alfabank.assesment.tags.Link;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.alfabank.assesment.assertions.PersonAssert.assertThat;

@Description("Группировка тестов")
@Link("https://www.arhohuttunen.com/junit-5-nested-tests/")
public class TestsGroups {

    private final Singer singer = PersonsProvider.getSinger();

    @Nested
    @DisplayName("Main scenarios")
    class SetProperties {
        @Test
        public void canSetSurname() {
            assertThat(singer).hasSurname("Ivanova");
        }

        @Test
        public void canSetFirstName() {
            assertThat(singer).hasFirstName("Vika");
        }
    }

    @Nested
    @DisplayName("Additional scenarios")
    class AdditionalTests {
        @Test
        public void songsHasExpectedSize() {
            assertEquals(2, singer.getSongs().size());
        }
    }
}
