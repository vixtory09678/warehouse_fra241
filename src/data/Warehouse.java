package data;

import java.util.*;
import model.ProductItem;

public class Warehouse {

    private List<HashMap<String, ProductItem>> listItemStore;
    private int maxRows;
    private int maxGrid;

    public Warehouse() {
    }

    // build warehouse
    public void build(int rows, int grid) {
        if (listItemStore.size() > 0)
            return;
        this.maxRows = rows;
        this.maxGrid = grid;

        listItemStore = new ArrayList<HashMap<String, ProductItem>>();
        setupStock(maxRows);
    }

    // add item to stock
    public String addItem(int rows, ProductItem item) {
        if (rows < 0 || rows > maxRows)
            return "";

        if (listItemStore.get(rows).size() > maxGrid) {
            return MsgProcess.FULL_ERR;
        }

        listItemStore.get(rows).put(item.getId(), item);
        return MsgProcess.SUCCESS;
    }

    public String retieveItem(int rows, ProductItem item) {
        return "";
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
