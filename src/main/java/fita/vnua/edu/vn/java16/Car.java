package fita.vnua.edu.vn.java16;

public class Car extends Vehicle{
    Long kilomenters;
    Long year;

    public Car(String code, String engineType, Long kilomenters, Long year) {
        super(code, engineType);
        this.kilomenters = kilomenters;
        this.year = year;
    }
}
