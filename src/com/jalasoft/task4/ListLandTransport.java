package com.jalasoft.task4;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {

    private List<Land> land;

    public ListLandTransport() { // Constructor agregado para poder iniciar la Lista
        land = new ArrayList<>();
    }

    public void addLand(Land land) { // Modificador cambiado a publico para poder agregar lands
        this.land.add(land);
    }

    public void display() {
        land.stream().forEach(land -> System.out.println(land.displayData()));
    }
}
