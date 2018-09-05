package model;

public class ProductItem{
    private String id = "";
    public ProductItem(String id){
        this.id = id;
    }
    public ProductItem(){}

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
