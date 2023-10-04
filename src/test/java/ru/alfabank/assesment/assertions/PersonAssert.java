package ru.alfabank.assesment.assertions;

import org.assertj.core.api.AbstractAssert;
import ru.alfabank.assesment.entities.Person;

public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert(Person actual) {
        super(actual, PersonAssert.class);
    }

    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }

    public PersonAssert hasSurname(String surname) {
        isNotNull();
        if (!actual.getSurname().equals(surname)) {
            failWithMessage("Expected person to have surname %s but was %s", surname, actual.getSurname());
        }
        return this;
    }

    public PersonAssert hasFirstName(String firstName) {
        isNotNull();
        if (!actual.getFirstName().equals(firstName)) {
            failWithMessage("Expected person to have first name %s but was %s", firstName, actual.getFirstName());
        }
        return this;
    }
}
