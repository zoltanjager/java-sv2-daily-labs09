package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void createTicketTest() {
        Ticket ticket = new Ticket("Sting",
                                    LocalDate.of(2021,05,01),
                                    LocalTime.of(20,00), 5000);

        assertEquals("Sting", ticket.getNameOfBand());
        assertEquals(LocalDate.of(2021,05,01), ticket.getDate());
        assertEquals(LocalTime.of(20,00), ticket.getTime());
        assertEquals(5000,ticket.getPrice());
    }

    @Test
    void entryTimeTest() {

        Ticket ticket = new Ticket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000);

        assertEquals(LocalTime.of(19,00), ticket.entryTime());
    }
}