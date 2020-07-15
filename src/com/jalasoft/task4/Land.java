package com.jalasoft.task4;

public class Land extends Transport {

    private boolean hasMotor;

    Land(String name, int price, boolean hasMotor) { // Usando modificador de acceso por defecto
        super(name, price);
        this.hasMotor = hasMotor;
    }

    String displayData() { // Usando modificador de acceso por defecto
        return this.toString();
    }

    public boolean isHasMotor() { // Agregado para poder acceder al atributo hasMotor
        return hasMotor;
    }
}
