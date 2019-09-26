public class Toyota extends Car {
    private boolean isHibrid;

    public Toyota(String name, String size,boolean isHibrid) {
        super(name, size);
        setHibrid(isHibrid);
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity*100, direction);
    }

    public boolean isHibrid() {
        return isHibrid;
    }

    public void setHibrid(boolean hibrid) {
        isHibrid = hibrid;
    }
}
