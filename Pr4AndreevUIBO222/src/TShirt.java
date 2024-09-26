public class TShirt extends Clothes implements  MenClothing, WomenClothing{

    public TShirt(Size size, float coast, String color) {
        super(size, coast, color);
    }


    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: размер: " + size + " цена: " + coast + " цвет: " + color);



    }
    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: размер: " + size + " цена: " + coast + " цвет: " + color);

    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + size +
                ", coast=" + coast +
                ", color='" + color + '\'' +
                '}';
    }
}
