package Enums;

public enum DaysDurations {
    ONE(1), TWO(2), FIVE(5);


    private int days;
    DaysDurations(int i) {
        this.days = i;
    }

    public int getDays() {
        return days;
    }
}
