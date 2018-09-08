package controller;

class MainOrder {
    RobotService robot;

    MainOrder() {
        robot = new RobotService();
    }

    // 0XXXX Retrieve a product id XXXX
    public void retrieveProduct(ProductItem item) {
        robot.pick(item);
    }

    // 1XXXX Store a product id XXXX
    public void storeProduct(ProductItem item) {

    }

    // 2XY00 Sort warehouse X at row Y
    public void sortWarehouse(int warehouseId, int rows) {

    }

    // 30000 Retrieve a product from the conveyor belt
    public ProductItem retrieveFromBelt() {

    }

    // 40000 Output information of all warehouses
    public void wareHouseInformation() {

    }

    // 5XXXX Search for a product ID XXXX
    public void searchProduct(ProductItem item) {

    }

    // 9XXXXYYYY Manually put a product id XXXX at position YYYY
    public void putProduct(ProductItem item, int rows, int posX, int posY) {

    }

}