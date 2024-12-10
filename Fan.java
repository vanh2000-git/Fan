public class Fan {
    static final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;
    private int speed; private boolean on; private double radius; private String color;
    public Fan() {
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + (speed ==1?"slow":(speed==2)?"medium, ":"fast, ") +
                (on?"Fan is on":"Fan is off") +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
