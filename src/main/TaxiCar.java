package main;


public class TaxiCar extends Car implements Comparable <TaxiCar> {

    private int bookValue;
    private double fuelConsumption;
    private int speed;
    private int pricePerKilometer;

    public TaxiCar(int yearMade,
                   String manufacturer,
                   String vinCode,
                   String engineID,
                   Person owner,
                   String carRegistrationNumber,
                   CarCategory carCategory,
                   int bookValue,
                   double fuelConsumption,
                   int speed,
                   int pricePerKilometer) {
        super(yearMade, manufacturer, vinCode, engineID, owner, carRegistrationNumber, carCategory);
        if (bookValue>=0) {
            this.bookValue = bookValue;
        } else {
            throw new IllegalArgumentException();
        }
        if (fuelConsumption>0) {
            this.fuelConsumption = fuelConsumption;
        } else {
            throw new IllegalArgumentException();
        }
        if (speed>=0) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException();
        }
        if (pricePerKilometer>0) {
            this.pricePerKilometer = pricePerKilometer;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getBookValue() {
        return bookValue;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setBookValue(int bookValue) {
        this.bookValue = bookValue;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPricePerKilometer(int pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }

    @Override
    public String toString() {
        return "TaxiCar{" +
                "bookValue=" + bookValue +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", pricePerKilometer=" + pricePerKilometer +
                '}';
    }

    @Override
    public int compareTo(TaxiCar taxiCar) {
        int result = 0;
        double differenceFuelConsumption = this.fuelConsumption - taxiCar.fuelConsumption;
        if (differenceFuelConsumption>0) {
            result = 1;
        } else if (differenceFuelConsumption<0) {
            result = -1;
        } else {
            int differenceBookValue = this.bookValue - taxiCar.bookValue;
            if (differenceBookValue>0) {
                result = 1;
            } else if (differenceBookValue<0) {
                result = -1;
            } else {
                result = 0;
            }
        }
        return result;
    }
}
