package Enums;

public enum RidesDurations {
    TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100);

    private int rides;
    RidesDurations(int i) {
        rides = i;
    }

    public int getRides() {
        return rides;
    }
}
