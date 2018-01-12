abstract class Skipass {
    private static int lastSerial = 0;

    private int serial;
    private String name;
    CountStrategy countStrategy;

    private boolean banned = false;

    Skipass(String newName, CountStrategy newCountStrategy) {
        countStrategy = newCountStrategy;
        lastSerial++;
        serial = lastSerial;
        name = newName;
    }

    void ban() {
        banned = true;
    }

    abstract boolean ride();

    public boolean getBanned() {
        return banned;
    }

    public String getName() {
        return name;
    }

    public int getSerial() {
        return serial;
    }
}
