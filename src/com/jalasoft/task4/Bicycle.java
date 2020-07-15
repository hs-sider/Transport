package com.jalasoft.task4;

public class Bicycle extends Land {
    private boolean exerciseBike;

    public Bicycle(String name, int price, boolean hasMotor, boolean exerciseBike) { // Modificador cambiado a publico para poder acceder al constructor
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    public String displayData() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("name = %s, price = %d, hasMotor = %s, exercise = %s",
                this.getName(),
                this.getPrice(),
                this.isHasMotor(),
                this.exerciseBike);
    }
}
