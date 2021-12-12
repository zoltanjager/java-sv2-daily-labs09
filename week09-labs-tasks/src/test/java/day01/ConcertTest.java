package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void createConcertTest() {
        List<Person> persons = new ArrayList<>();
        Concert concert = new Concert(persons);

        assertEquals(0, concert.getPersons().size());

    }

    @Test
    void addPersonTest() {

        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000, "STING");

        Ticket ticket = new Ticket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000);

        Person person = new Person(ticket);
        Person anotherPerson = new Person(frontOfStageTicket);

        List<Person> persons = new ArrayList<>();
        Concert concert = new Concert(persons);


        //concert.addPerson(person, LocalTime.of(18,10));
        concert.addPerson(anotherPerson, LocalTime.of(18,10));


        assertEquals(1, concert.getPersons().size());

    }

    @Test
    void addPersonTestThrowException() {

        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000, "STING");

        Ticket ticket = new Ticket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000);

        Person person = new Person(ticket);
        Person anotherPerson = new Person(frontOfStageTicket);

        List<Person> persons = new ArrayList<>();
        Concert concert = new Concert(persons);


        assertThrows(IllegalArgumentException.class, ()-> concert.addPerson(person, LocalTime.of(18,10)));

    }
}