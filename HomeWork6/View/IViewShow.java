package View;
import Person.*;

import java.util.HashSet;

public interface IViewShow {
    void showContacts(HashSet<Person> listPersons);
    void showPhoneList(Person person);
    int showMenu();


}