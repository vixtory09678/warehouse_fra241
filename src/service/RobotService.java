package service;
public class RobotService extends BaseClass{

    private final int WAREHOUSE_COUNT = 5;

    ConveyorBelt belt;
    Warehouse[] warehouse;

    public RobotService(){
        belt = new ConveyorBelt();
        warehouse = new Warehouse[WAREHOUSE_COUNT];
        warehouse[0].build(5, 10*10);
        warehouse[1].build(5, 10*10);
        warehouse[2].build(5, 10*10);
        warehouse[3].build(7, 5*5);
        warehouse[4].build(20, 20*20);
    }

    public String pick(ProductItem item){
        CodeId warehouseCode = getCodeId(item.getId())
        if(warehouseCode == null) return;

        int number = findWarehouseNumber(warehouseCode.getKey());
        

        println("Moving from Belt to A");
    }

    public String store(ProductItem item){
        CodeId warehouseCode = getCodeId(item.getId())
        if(warehouseCode == null) return "";

        int number = findWarehouseNumber(warehouseCode.getKey());
        warehouse[number].addItem(warehouseCode.getRows(),item);
    }

    public void sort(int number, int rows){
        // warehouseCode[number].get(rows).sort()
    }

    private int findWarehouseNumber(Char key){
        return (key - 'A') % WAREHOUSE_COUNT;
    }

}
