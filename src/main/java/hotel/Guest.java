package hotel;

public class Guest {

    private String name;
    private int partySize;

    public Guest(String name, int partySize) {
        this.name = name;
        this.partySize = partySize;
    }

    public int getPartySize() {
        return partySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
