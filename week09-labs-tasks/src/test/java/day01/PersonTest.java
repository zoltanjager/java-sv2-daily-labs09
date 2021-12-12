package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void createPersonTest() {

        Ticket ticket = new Ticket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000);

        Person person = new Person(ticket);

    }

    @Test
    void getTicketTest() {
    }
}