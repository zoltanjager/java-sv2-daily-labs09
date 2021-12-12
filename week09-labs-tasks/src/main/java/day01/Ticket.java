package day01;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private String nameOfBand;
    private LocalDate date;
    private LocalTime time;
    private int price;

    public Ticket(String nameOfBand, LocalDate date, LocalTime time, int price) {
        this.nameOfBand = nameOfBand;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public LocalTime entryTime() {
        return time.minusHours(1);
    }

    public String getNameOfBand() {
        return nameOfBand;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }
}
