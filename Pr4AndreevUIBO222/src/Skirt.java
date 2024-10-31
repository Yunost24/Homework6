public class Skirt extends Clothes implements WomenClothing{

    public Skirt(Size size, float coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка: размер: " + size + " цена: " + coast + " цвет: " + color);
    }


}
