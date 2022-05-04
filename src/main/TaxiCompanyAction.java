package main;

import java.util.*;


public class TaxiCompanyAction {

    final static String PATH_TO_TAXI_COMPANY_PROPS = "/resources/taxiCompany.properties";

    private static int getInputSpeedLowerBound() {
        System.out.println("*****************************");
        Scanner scanner = new Scanner(System.in);
        int inputSpeedLowerBound = 0;
        String inputString;
        do {
            System.out.println("Please enter a positive integer for a lower bound of a taxi car speed:");
            try {
                inputString = scanner.nextLine();
                inputSpeedLowerBound = Integer.parseInt(inputString);
            } catch (Exception e) {
                inputSpeedLowerBound = -1;
            }
        } while (inputSpeedLowerBound < 0);
        return inputSpeedLowerBound;
    }

    public static int getInputSpeedUpperBound(int inputSpeedLowerBound) {
        System.out.println("*****************************");
        Scanner scanner = new Scanner(System.in);
        int inputSpeedUpperBound = 0;
        String inputString;
        do {
            System.out.println("Please enter a positive integer for an upper bound, which should be bigger than or equal to the lower bound:");
            try {
                inputString = scanner.nextLine();
                inputSpeedUpperBound = Integer.parseInt(inputString);
            } catch (Exception e) {
                inputSpeedUpperBound = -1;
            }
        } while ((inputSpeedUpperBound < 0) | (inputSpeedUpperBound <= inputSpeedLowerBound));
        return inputSpeedUpperBound;
    }

    public static void printToConsoleSummary(TaxiCompany taxiCompanyUber, ArrayList<TaxiCar> listOfTaxiCars) {
        System.out.println("*****************************");
        System.out.println("Summary: ");
        System.out.println(taxiCompanyUber.getTaxiCompanyName() + " company has been created with " + listOfTaxiCars.size() + " taxi cars.");
    }

    public static void printToConsoleWelcomeMessage() {
        System.out.println("*****************************");
        System.out.println("Main Task (Java.Collections): #10 Taxi Company");
        System.out.println("Welcome to the Taxi Company Application (consists of three parts)!");
    }

    public static void proceedToNextPartOfTask(String partName) {
        System.out.println("*****************************");
        System.out.println("Please press \"Enter\" button to proceed to part " + partName + " of the task:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void printToConsoleTitleOfPart(String partName) {
        System.out.println("*****************************");
        System.out.println("Part " + partName + " of the task:");
    }

    public static void printToConsoleResultPartA(TaxiCompany taxiCompany, String taskPart, int valuationOfInventory) {
        System.out.println("*****************************");
        System.out.println("Results for part " + taskPart + ":");
        System.out.println("- The total valuation of all taxi cars of " + taxiCompany.getTaxiCompanyName() + " company: " + valuationOfInventory);
    }

    public static void printToConsoleResultPartB(TaxiCompany taxiCompany, String taskPart) {
        System.out.println("*****************************");
        System.out.println("Results for part " + taskPart + ":");
        System.out.println("- Taxi cars inventory of " + taxiCompany.getTaxiCompanyName() +
                " company sorted by fuel consumption: ");
    }

    public static void printToConsoleResultPartC(TaxiCompany taxiCompany,
                                                 String taskPart,
                                                 int inputSpeedLowerBound,
                                                 int inputSpeedUpperBound) {
        System.out.println("*****************************");
        System.out.println("Results for part " + taskPart + ":");
        System.out.println("- The taxi cars of " +
                taxiCompany.getTaxiCompanyName() +
                " company with speed parameters in the range from " + inputSpeedLowerBound + " to " + inputSpeedUpperBound + " km/h");
    }

    public static String getTaxiCompanyNameFromProps() {
        Properties appProps = new Properties();
        PropLoader.getProperty(appProps, PATH_TO_TAXI_COMPANY_PROPS);
        String taxiCompanyName;
        taxiCompanyName = appProps.getProperty("TAXI_COMPANY_NAME");
        return taxiCompanyName;
    }

    public static String getTaxiCompanyIDFromProps() {
        Properties appProps = new Properties();
        PropLoader.getProperty(appProps, PATH_TO_TAXI_COMPANY_PROPS);
        String businessID;
        businessID = appProps.getProperty("BUSINESS_ID");
        return businessID;
    }

    public static void main(String[] args) {
        String taskPart;
        int valuationOfInventory;
        ArrayList<TaxiCar> listOfTaxiCars;
        int inputSpeedLowerBound;
        int inputSpeedUpperBound;
        ArrayList<TaxiCar> taxiCarsWithSpeedInRange;
        printToConsoleWelcomeMessage();
        TaxiCompany taxiCompanyUber = new TaxiCompany(
                getTaxiCompanyIDFromProps(),
                getTaxiCompanyNameFromProps(),
                new ArrayList<TaxiCar>()
        );
        listOfTaxiCars = TaxiCarsList.generateListOfTaxiCars();
        taxiCompanyUber.addListOfTaxiCarsToInventory(listOfTaxiCars);

        printToConsoleSummary(taxiCompanyUber, listOfTaxiCars);
        taskPart = "(a)";
        proceedToNextPartOfTask(taskPart);
        printToConsoleTitleOfPart(taskPart);
        valuationOfInventory = taxiCompanyUber.valuationOfInventory();
        printToConsoleResultPartA(taxiCompanyUber, taskPart, valuationOfInventory);
        taskPart = "(b)";
        proceedToNextPartOfTask(taskPart);
        printToConsoleTitleOfPart(taskPart);
        printToConsoleResultPartB(taxiCompanyUber, taskPart);
        Collections.sort(taxiCompanyUber.getInventoryTaxiCars());
        taxiCompanyUber.printToConsoleTaxiCarsInventory();
        taskPart = "(c)";
        proceedToNextPartOfTask(taskPart);
        printToConsoleTitleOfPart(taskPart);
        inputSpeedLowerBound = getInputSpeedLowerBound();
        inputSpeedUpperBound = getInputSpeedUpperBound(inputSpeedLowerBound);
        printToConsoleResultPartC(taxiCompanyUber, taskPart, inputSpeedLowerBound, inputSpeedUpperBound);
        taxiCarsWithSpeedInRange = taxiCompanyUber.getTaxiCarsWithSpeedInRange(inputSpeedLowerBound, inputSpeedUpperBound);
        taxiCompanyUber.printToConsoleTaxiCarsList(taxiCarsWithSpeedInRange);
    }
}