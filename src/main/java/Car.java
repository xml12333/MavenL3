
public class Car extends Vehicle {
    private boolean isAWD;

    public Car(String name, String size) {
        super(name, size);
        setAWD(isAWD);

    }

    @Override
    public void steer(int direction) {
        super.steer(direction*10);
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity*10, direction);
    }

    public boolean isAWD() {
        return isAWD;
    }

    public void setAWD(boolean AWD) {
        isAWD = AWD;
    }
}
