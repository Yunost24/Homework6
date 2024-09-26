public class Pants extends Clothes implements MenClothing,WomenClothing {

    public Pants(Size size, float coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressMan() {

        System.out.println("Мужские штаны: размер: " + size + " цена: " + coast + " цвет: " + color);

    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: размер: " + size + " цена: " + coast + " цвет: " + color);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", coast=" + coast +
                ", color='" + color + '\'' +
                '}';
    }
}
