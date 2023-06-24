package Repo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void getPrice() {
        Product product1 = new Product(3, "Колбаса", 200);
        int expected = 200;
        int actual = product1.getPrice();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAndSetTitle() {
        Product product1 = new Product(3, "Колбаса", 200);
        product1.setTitle("Хлеб");
        String expected = "Хлеб";
        String actual = product1.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAndSetPrice() {
        Product product1 = new Product(3, "Колбаса", 200);
        product1.setPrice(500);
        int expected = 500;
        int actual = product1.getPrice();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void hashcodeProd() {
        Product product1 = new Product(3, "Колбаса", 200);
        product1.hashCode();
        int expected = -279274299;
        int actual = product1.hashCode();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equals() {
        Product product1 = new Product(3, "Колбаса", 200);
        boolean expected = false;
        boolean actual = product1.equals(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equals3() {
        Product product1 = new Product(3, "Колбаса", 200);
        boolean expected = true;
        boolean actual = product1.equals(product1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equals4() {
        Product product1 = new Product(55, "Молоко", 600);
        Product product2 = new Product(58, "Молоко", 800);

        boolean expected = false;
        boolean actual = product1.equals(product2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equals5() {

        Product product1 = new Product(55, "Молоко", 600);
        Product product2 = new Product(58, "Молоко", 800);
        boolean expected = false;
        boolean actual = product1.equals(product2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equals6() {

        Product product1 = new Product(55, "Молоко", 600);
        Product product2 = new Product(55, "Молоко", 600);
        boolean expected = true;
        boolean actual = product1.equals(product2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equals7() {
        Product product2 = new Product(58, "Молоко", 800);
        boolean expected = false;
        boolean actual = product2.equals(null);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equals8() {
        Product product1 = new Product(55, "Молоко", 600);
        boolean expected = true;
        boolean actual = product1.getTitle().equals(product1.getTitle());
        Assertions.assertEquals(expected, actual);
    }
}