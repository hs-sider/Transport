package com.jalasoft.task4;

public class Main {

    public static void main (String args[]) {

        ListLandTransport trans = new ListLandTransport();
        trans.addLand(new Bicycle("Cross", 1500, false, false));
        trans.addLand(new Car("Audi", 2000, true, false));
        trans.display();
    }
}
