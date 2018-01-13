class Date {
    private long value;

    Date() {
        value = System.currentTimeMillis();
    }

    Date(int daysOffset) {
        long msOffset = daysOffset * 86400000;
        value = System.currentTimeMillis() + msOffset;
    }

    boolean before(Date other) {
        return value < other.getValue();
    }

    long getValue() {
        return value;
    }
}
