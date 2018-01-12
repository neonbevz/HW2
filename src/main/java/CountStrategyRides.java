class CountStrategyRides implements CountStrategy {
    private int allowed;
    private int taken;

    CountStrategyRides(int number) {
        allowed = number;
        taken = 0;
    }

    @Override
    public boolean ride() {
        if (taken > allowed) {
            return false;
        }
        taken++;
        return true;
    }
}
