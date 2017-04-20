package ooabusers.switches;

class Car {
    public static final int SPORTS = 1;
    public static final int FAMILY = 2;
    public static final int SMALL = 3;
    public static final int DEFAULT = 4;
    private int type;

    public int type() {
        return this.type;
    }

    Car(int type) {
        this.type = type;
    }
}
