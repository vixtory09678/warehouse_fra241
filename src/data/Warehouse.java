package data;

import java.util.*;
import model.ProductItem;

public class Warehouse {

    private List<HashMap<String, ProductItem>> listItemStore;
    private int maxRows;
    private int maxGridX;
    private int maxGridY;

    public Warehouse() {
    }

    // build warehouse
    public void build(int rows, int gridX, int gridY) {
        if (listItemStore.size() > 0)
            return;
        this.maxRows = rows;
        this.maxGridX = gridX;
        this.maxGridY = gridY;

        listItemStore = new ArrayList<HashMap<String, ProductItem>>();
        setupStock(maxRows);
    }

    public int getMaxGridX() {
        return this.maxGridX;
    }

    public int getMaxGridY() {
        return this.maxGridY;
    }

    // add item to stock
    public String addItem(int rows, ProductItem item) {
        if (rows < 0 || rows > maxRows)
            return MsgProcess.ROWS_ERR;

        if (listItemStore.get(rows).size() > maxGrid) {
            return MsgProcess.FULL_ERR;
        }

        if (listItemStore.get(rows).containsKey(item.getId()) == true)
            return MsgProcess.SLOT_OCCUPIED;

        listItemStore.get(rows).put(item.getId(), item);
        return MsgProcess.SUCCESS;
    }

    public ProductItem retrieveItem(int rows, ProductItem item) {
        if (rows < 0 || rows > maxRows)
            return MsgProcess.ROWS_ERR;

        if (isItem(rows, item)) {
            listItemStore.get(rows).remove(item);
            return item;
        } else {
            return null;
        }
    }

    public HashMap<String, ProductItem> getAllItemInRows(int rows) {
        return listItemStore.get(rows);
    }

    // check item available
    public boolean isItem(int rows, ProductItem item) {
        // if(rows < 0 || rows > maxRows) return;
        return listItemStore.get(rows).containsKey(item.getId());
    }

    // setup stock
    private void setupStock(int rows) {
        for (int i = 0; i < rows; i++) {
            listItemStore.add(new HashMap<String, ProductItem>());
        }
    }
}
