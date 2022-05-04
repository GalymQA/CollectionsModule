package main;


public class Car extends Vehicle {

    private Person owner;
    private String carRegistrationNumber;
    private CarCategory carCategory;

    public Car(int yearMade,
               String manufacturer,
               String vinCode,
               String engineID,
               Person owner,
               String carRegistrationNumber,
               CarCategory carCategory) {
        super(yearMade, manufacturer, vinCode, engineID);
        this.owner = owner;
        this.carRegistrationNumber = carRegistrationNumber;
        this.carCategory = carCategory;
    }

    public Person getOwner() {
        return owner;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public CarCategory getCarCategory() {
        return carCategory;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public void setCarCategory(CarCategory carCategory) {
        this.carCategory = carCategory;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner=" + owner +
                ", carRegistrationNumber='" + carRegistrationNumber + '\'' +
                ", carCategory=" + carCategory +
                '}';
    }
}
