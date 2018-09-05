package model;
public class CodeId {

    private char key;
    private int rows;
    private int posX;
    private int posY;
    private CodeId order;

    public CodeId () {
    }

    public char getKey(){
        return key;
    }

    public int getRows(){
        return rows;
    }

    public int getPositionX(){
        return posX;
    }

    public int getPositionY(){
        return posY;
    }


    public void setKey(char key){
        this.key = key;
    }

    public void setRows(int rows){
        this.rows = rows;
    }

    public void setPositionX(int posX){
        this.posX = posX;
    }

    public void setPositionY(int posY){
        this.posY = posY;
    }


}
