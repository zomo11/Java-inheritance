package inheritance;

public class cylinder extends circle {
    private double height;

    public cylinder() {
        this.height = 1.0;
    }

    public cylinder(double radius) {
        super();
    }

    public cylinder(double radius, double height) {
        super();
        this.height = height;
    }

    public cylinder(double radius, String color, double height) {
        super();
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

}
