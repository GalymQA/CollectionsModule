package main;


public abstract class Vehicle {

    private int yearMade;
    private String manufacturer;
    private String vinCode;
    private String engineID;

    public Vehicle(int yearMade, String manufacturer, String vinCode, String engineID) {
        this.yearMade = yearMade;
        this.manufacturer = manufacturer;
        this.vinCode = vinCode;
        this.engineID = engineID;
    }

    public int getYearMade() {
        return yearMade;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getVinCode() {
        return vinCode;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "yearMade=" + yearMade +
                ", manufacturer='" + manufacturer + '\'' +
                ", vinCode='" + vinCode + '\'' +
                ", engineID='" + engineID + '\'' +
                '}';
    }
}
