package com.company;

class Figure {
    private double volume;

    public Figure(double radius, double height) {
        this.volume = Math.PI * Math.pow(radius, 2) * height;
    }

    public Figure(double side, String figure) {
        this.volume = figure == "ball" ? 4/3 * Math.PI * Math.pow(side, 3) : Math.pow(side, 3);
    }

    public double getVolume() {
        return volume;
    }
}
