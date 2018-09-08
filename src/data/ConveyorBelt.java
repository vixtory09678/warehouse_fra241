package data;

import java.util.PriorityQueue;
import model.ProductItem;

public class ConveyorBelt {

    private final int ITEM_MAX = 10;
    private PriorityQueue<ProductItem> items;

    public ConveyorBelt() {
        items = new PriorityQueue<ProductItem>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void addProduct(ProductItem item) {
        if (items.size() < ITEM_MAX) {
            items.add(item);
        } else {
            // item add more than max size
        }
    }

    public ProductItem getProduct() {

        if (items.isEmpty())
            return null;

        ProductItem item = items.peek();
        items.remove(item);
        return item;
    }

    public PriorityQueue<ProductItem> getProductAll() {
        return items;
    }
}
