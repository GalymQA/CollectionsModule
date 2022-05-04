package main;

import java.util.ArrayList;


public class TaxiCompany {

    private String businessID;
    private String taxiCompanyName;
    private ArrayList<TaxiCar> inventoryTaxiCars;

    public TaxiCompany(String businessID, String taxiCompanyName, ArrayList<TaxiCar> inventoryTaxiCars) {
        this.businessID = businessID;
        this.taxiCompanyName = taxiCompanyName;
        this.inventoryTaxiCars = inventoryTaxiCars;
    }

    public String getBusinessID() {
        return businessID;
    }

    public String getTaxiCompanyName() {
        return taxiCompanyName;
    }

    public ArrayList<TaxiCar> getInventoryTaxiCars() {
        return inventoryTaxiCars;
    }

    public void setBusinessID(String businessID) {
        this.businessID = businessID;
    }

    public void setTaxiCompanyName(String taxiCompanyName) {
        this.taxiCompanyName = taxiCompanyName;
    }

    public void setInventoryTaxiCars(ArrayList<TaxiCar> inventoryTaxiCars) {
        this.inventoryTaxiCars = inventoryTaxiCars;
    }

    @Override
    public String toString() {
        return "TaxiCompany{" +
                "businessID=" + businessID +
                ", taxiCompanyName='" + taxiCompanyName + '\'' +
                '}';
    }

    public void addTaxiCarToInventory(TaxiCar taxiCar) {
        this.inventoryTaxiCars.add(taxiCar);
    }

    public void addListOfTaxiCarsToInventory(ArrayList<TaxiCar> listOfTaxiCars) {
        for (TaxiCar taxiCar: listOfTaxiCars) {
            this.inventoryTaxiCars.add(taxiCar);
        }
    }

    public void removeTaxiCarFromInventory(TaxiCar taxiCar) {
        this.inventoryTaxiCars.remove(taxiCar);
    }

    public int valuationOfInventory() {
        int valuation = 0;
        for (TaxiCar car: this.inventoryTaxiCars) {
            valuation += car.getBookValue();
        }
        return valuation;
    }

    public void printToConsoleTaxiCar(TaxiCar taxiCar) {
        System.out.println("*****************************");
        System.out.println("- Car owner: " + taxiCar.getOwner().getFirstName() + " " + taxiCar.getOwner().getSecondName());
        System.out.println("- Car manufacturer: " + taxiCar.getManufacturer());
        System.out.println("- Car category: " + taxiCar.getCarCategory().getVehicleCategoryName());
        System.out.println("- Engine ID: " + taxiCar.getEngineID());
        System.out.println("- Book value: " + taxiCar.getBookValue());
        System.out.println("- Fuel consumption: " + taxiCar.getFuelConsumption());
        System.out.println("- Price per kilometer: " + taxiCar.getPricePerKilometer());
        System.out.println("- Speed: " + taxiCar.getSpeed());
    }

    public void printToConsoleTaxiCarsList(ArrayList<TaxiCar> taxiCarList) {
        if (taxiCarList.size()==0) {
            System.out.println("*****************************");
            System.out.println("No taxi cars.");
        } else {
            for (TaxiCar taxiCar: taxiCarList) {
                printToConsoleTaxiCar(taxiCar);
            }
        }
    }

    public void printToConsoleTaxiCarsInventory() {
        printToConsoleTaxiCarsList(inventoryTaxiCars);
    }

    public ArrayList<TaxiCar> getTaxiCarsWithSpeedInRange(int inputSpeedLowerBound, int inputSpeedUpperBound) {
        ArrayList<TaxiCar> refinedListOfTaxiCars = new ArrayList<>();
        for (TaxiCar taxiCar: inventoryTaxiCars) {
            if ((taxiCar.getSpeed()>=inputSpeedLowerBound)&(taxiCar.getSpeed()<=inputSpeedUpperBound)) {
                refinedListOfTaxiCars.add(taxiCar);
            }
        }
        return refinedListOfTaxiCars;
    }

}