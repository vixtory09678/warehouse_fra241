package model;

public class ProductItem{
    private String id = "";
    ProductItem(String id){
        this.id = id;
    }
    ProductItem(){}

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
