package Repo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    Product[] products = new Product[0];
    Product prod1 = new Product(1, "Молоко", 50);
    Product prod2 = new Product(2, "Хлеб", 33);
    Product prod3 = new Product(3, "Колбаса", 200);

    @Test
    public void removeById() {
        ShopRepository shp = new ShopRepository();
        shp.add(prod1);
        shp.add(prod2);
        shp.add(prod3);
        shp.remove(3);

        Product[] expected = shp.findAll();
        Product[] actual = {prod1, prod2};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void NotFoundException() {
        ShopRepository shp = new ShopRepository();
        shp.add(prod1);
        shp.add(prod2);
        shp.add(prod3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            shp.remove(-4);
        });
    }
    @Test
    public void findById() {
        Product[] products = new Product[0];
        ShopRepository shp = new ShopRepository();
        shp.add(prod1);
        shp.add(prod2);
        shp.add(prod3);
        Product[] expected = {prod1};
        Product[] actual = {shp.findById(1)};
        Assertions.assertArrayEquals(expected, actual);
}
}
