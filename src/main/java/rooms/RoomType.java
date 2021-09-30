package rooms;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),

    EVENTROOM1(10),
    EVENTROOM2(25),
    EVENTROOM3(100),
    EVENTROOM4(500);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}