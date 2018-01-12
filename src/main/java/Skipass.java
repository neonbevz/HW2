abstract class Skipass {
    private CountStrategy countStrategy;

    Skipass(CountStrategy newCountStrategy) {
        countStrategy = newCountStrategy;
    }

    abstract boolean ride();
}
