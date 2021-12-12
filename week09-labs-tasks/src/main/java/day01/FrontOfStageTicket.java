package day01;

import java.time.LocalDate;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{
    private String extraCode;

    public FrontOfStageTicket(String nameOfBand, LocalDate date, LocalTime time, int price, String extraCode) {
        super(nameOfBand, date, time, price);
        this.extraCode = extraCode;
    }

    public LocalTime entryTime() {
        return getTime().minusHours(2);
    }

    public String getExtraCode() {
        return extraCode;
    }
}
