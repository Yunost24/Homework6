public abstract class Clothes {

    protected Size size;
    protected float coast;
    protected String color;

    public Clothes(Size size, float coast, String color) {
        this.size = size;
        this.coast = coast;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public float getCoast() {
        return coast;
    }

    public String getColor() {
        return color;
    }


}
