class SkipassHoliday extends Skipass {
    SkipassHoliday(CountStrategy newCountStrategy) {
        super(newCountStrategy);
    }

    @Override
    boolean ride() {
        return false;
    }
}
