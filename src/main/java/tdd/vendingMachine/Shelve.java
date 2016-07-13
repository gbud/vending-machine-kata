package tdd.vendingMachine;

public class Shelve {
    private Product product;
    int count = 0;

    public void load(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
