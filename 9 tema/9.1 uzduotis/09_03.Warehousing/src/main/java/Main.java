

public class Main {
    public static void main(String[] args) {

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);

        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        System.out.println(juice);

        juice.addToWarehouse(1.0);
        System.out.println(juice);

        System.out.println(juice.history());

        juice.printAnalysis();
    }
}
