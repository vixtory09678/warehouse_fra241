package service;

import java.util.HashMap;
import java.util.Map;

import data.Warehouse;
import model.CodeId;
import model.ProductItem;
import BaseClass;

public class RobotService extends BaseClass {

    private final int WAREHOUSE_COUNT = 5;

    ConveyorBelt belt;
    Warehouse[] warehouse;

    public RobotService() {
        belt = new ConveyorBelt();
        warehouse = new Warehouse[WAREHOUSE_COUNT];
        warehouse[0].build(5, 10, 10);
        warehouse[1].build(5, 10, 10);
        warehouse[2].build(5, 10, 10);
        warehouse[3].build(7, 5, 5);
        warehouse[4].build(20, 20, 20);

    }

    public String pick(ProductItem item) {
        CodeId warehouseCode = getCodeId(item.getId());
        if (warehouseCode == null)
            return MsgProcess.NONE;

        int number = findWarehouseNumber(warehouseCode.getKey());

        println("Moving from Belt to A");

        return MsgProcess.SUCCESS;
    }

    public String store(ProductItem item) {
        CodeId warehouseCode = getCodeId(item.getId());
        if (warehouseCode == null)
            return "";

        int number = findWarehouseNumber(warehouseCode.getKey());

        if (warehouse[number].getMaxGridX() < warehouseCode.getPositionX()
                || warehouse[number].getMaxGridY() < warehouseCode.getPositionY())
            return MsgProcess.SIZE_GRID_ERR;

        // condition is clearly
        warehouse[number].addItem(warehouseCode.getRows(), item);
        return MsgProcess.NONE;
    }

    public void sort(int number, int rows) {

        HashMap<String, ProductItem> items = warehouse[number].getAllItemInRows(rows);
        for (Map<String, ProductItem>.Entry elm : items.entrySet()) {
            ProductItem item = elm.getValue();
            CodeId code = getCodeId(item.getId());
            int whNum = findWarehouseNumber(code.getKey());

            // set item to correct warehouse
            if (whNum != number) {
                warehouse[whNum].addItem(code.getRows(), warehouse[number].retrieveItem(rows, item));
            }
        }

    }

    private int findWarehouseNumber(Char key) {
        return (key - 'A') % WAREHOUSE_COUNT;
    }

}
