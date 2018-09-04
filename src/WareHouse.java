import java.util.*;

public class Warehouse{

    private HashMap<String,ProductItem>[] itemStore;
    private int maxRows;

    public Warehouse () {
    }

    public void bulid(int rows , int grid){
        if(itemStore != null) return;
        this.maxRows = rows;

        itemStore = new HashMap<String,ProductItem>()[rows];
    }

    public void addItem(int rows, ProductItem item){
        if(rows > -1 && rows <= maxRows)
            itemStore[rows].put(item.getId() , item.getId());
    }

    public boolean isItem(int rows, ProductItem item){
        itemStore[rows].containsKey(item.getId())
    }
}
