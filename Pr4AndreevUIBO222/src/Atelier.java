public class Atelier {


    public void dressMen(Clothes[] clothes) {
        for (Clothes dressMens : clothes) {
            if (dressMens instanceof MenClothing) {
                ((MenClothing) dressMens).dressMan();
            }
        }
    }


    public void dressWomen(Clothes[] clothes) {
        for (Clothes dressWomens : clothes) {
            if (dressWomens instanceof WomenClothing) {
                ((WomenClothing) dressWomens).dressWomen();
            }
        }
    }
}
