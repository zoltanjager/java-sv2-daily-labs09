package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {

    @Test
    void createTicketTest() {
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000, "STING");

        assertEquals("Sting", frontOfStageTicket.getNameOfBand());
        assertEquals(LocalDate.of(2021,05,01), frontOfStageTicket.getDate());
        assertEquals(LocalTime.of(20,00), frontOfStageTicket.getTime());
        assertEquals(5000,frontOfStageTicket.getPrice());
        assertEquals("STING", frontOfStageTicket.getExtraCode());
    }

    @Test
    void entryTimeTest() {
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Sting",
                LocalDate.of(2021,05,01),
                LocalTime.of(20,00), 5000, "STING");

        assertEquals(LocalTime.of(18,00), frontOfStageTicket.entryTime());

    }

}