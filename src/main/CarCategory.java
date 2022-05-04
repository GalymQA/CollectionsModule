package main;


public enum CarCategory {
    CATEGORY_A('A'),
    CATEGORY_B('B'),
    CATEGORY_C('C'),
    CATEGORY_D('D'),
    CATEGORY_E('E');

    private char vehicleCategoryName;

    private CarCategory(char vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    public char getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    @Override
    public String toString() {
        return "CarCategory{" +
                "vehicleCategoryName=" + vehicleCategoryName +
                '}';
    }
}
