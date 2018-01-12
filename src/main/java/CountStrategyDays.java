class CountStrategyDays implements CountStrategy {
    private Date issued;
    private Date expires;

    CountStrategyDays(int duration) {
        issued = new Date();
        expires = new Date(duration);
    }

    @Override
    public boolean ride() {
        return issued.before(expires);
    }
}
