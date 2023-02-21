package View;

import Person.Person;

import java.util.HashSet;

public interface IViewChoice {
    int choiceContacts(HashSet<Person> listPersons);
    int choiceOperation();
}
