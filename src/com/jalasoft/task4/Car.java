package com.jalasoft.task4;

public class Car extends Land {

    private boolean useGas;

    public Car(String name, int price, boolean hasMotor, boolean useGas) { // Modificador cambiado a publico para poder acceder al constructor
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    public String displayData() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("name = %s, price = %d, hasMotor = %s, useGas = %s",
                this.getName(),
                this.getPrice(),
                this.isHasMotor(),
                this.useGas);
    }
}
