package data;

import java.util.*;
import model.ProductItem;

@SuppressWarnings("unchecked")
public class Warehouse{

    private List<HashMap<String,ProductItem>> listItemStore;
    private int maxRows;

    public Warehouse () {
    }

    public void build(int rows , int grid){
        if(listItemStore.size() > 0) return;
        this.maxRows = rows;

        listItemStore = new ArrayList<HashMap < String,ProductItem > >();
        setupStock(maxRows);
    }

    public void addItem(int rows, ProductItem item){
        if(rows > -1 && rows <= maxRows)
            listItemStore.get(rows).put(item.getId() , item);
    }

    public boolean isItem(int rows, ProductItem item){
        return listItemStore.get(rows).containsKey(item.getId());
    }

    private void setupStock(int rows){
        for (int i = 0; i < rows; i++) {
            listItemStore.add(new HashMap<String,ProductItem>());
        }
    }
}
