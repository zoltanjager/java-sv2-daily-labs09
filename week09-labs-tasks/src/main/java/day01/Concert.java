package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> persons = new ArrayList<>();

    public Concert(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person, LocalTime time) {
        if (person.getTicket().entryTime().isBefore(time)) {
            persons.add(person);
        } else {
            throw new IllegalArgumentException("Nem érvényes a jegyed");
        }
    }
}
