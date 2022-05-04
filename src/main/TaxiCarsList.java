package main;

import java.util.ArrayList;
import java.util.Properties;


public class TaxiCarsList {

    final static String PATH_TO_PERSON_PROPS = "/resources/person.properties";
    final static String PATH_TO_CAR_PROPS = "/resources/car.properties";

    public static ArrayList<TaxiCar> generateListOfTaxiCars() {
        Person personCarOwner;
        ArrayList<TaxiCar> listOfTaxiCars = new ArrayList<>();
        Properties carOwnerProps = new Properties();
        PropLoader.getProperty(carOwnerProps, PATH_TO_PERSON_PROPS);
        Properties carProps = new Properties();
        PropLoader.getProperty(carProps, PATH_TO_CAR_PROPS);

        personCarOwner = new Person(
                carOwnerProps.getProperty("PERSON_1_FIRST_NAME"),
                carOwnerProps.getProperty("PERSON_1_SECOND_NAME"),
                carOwnerProps.getProperty("PERSON_1_STATE_ID")
        );
        listOfTaxiCars.add(new TaxiCar(
                Integer.parseInt(carProps.getProperty("CAR_1_YEAR_MADE")),
                carProps.getProperty("CAR_1_MANUFACTURER"),
                carProps.getProperty("CAR_1_VIN_CODE"),
                carProps.getProperty("CAR_1_ENGINE_ID"),
                personCarOwner,
                carProps.getProperty("CAR_1_CAR_REGISTRATION_NUMBER"),
                CarCategory.CATEGORY_B,
                Integer.parseInt(carProps.getProperty("CAR_1_BOOK_VALUE")),
                Double.parseDouble(carProps.getProperty("CAR_1_FUEL_CONSUMPTION")),
                Integer.parseInt(carProps.getProperty("CAR_1_SPEED")),
                Integer.parseInt(carProps.getProperty("CAR_1_PRICE_PER_KILOMETER")))
        );

        personCarOwner = new Person(
                carOwnerProps.getProperty("PERSON_2_FIRST_NAME"),
                carOwnerProps.getProperty("PERSON_2_SECOND_NAME"),
                carOwnerProps.getProperty("PERSON_2_MIDDLE_NAME"),
                carOwnerProps.getProperty("PERSON_2_STATE_ID")
        );
        listOfTaxiCars.add(new TaxiCar(
                Integer.parseInt(carProps.getProperty("CAR_2_YEAR_MADE")),
                carProps.getProperty("CAR_2_MANUFACTURER"),
                carProps.getProperty("CAR_2_VIN_CODE"),
                carProps.getProperty("CAR_2_ENGINE_ID"),
                personCarOwner,
                carProps.getProperty("CAR_2_CAR_REGISTRATION_NUMBER"),
                CarCategory.CATEGORY_B,
                Integer.parseInt(carProps.getProperty("CAR_2_BOOK_VALUE")),
                Double.parseDouble(carProps.getProperty("CAR_2_FUEL_CONSUMPTION")),
                Integer.parseInt(carProps.getProperty("CAR_2_SPEED")),
                Integer.parseInt(carProps.getProperty("CAR_2_PRICE_PER_KILOMETER")))
        );

        personCarOwner = new Person(
                carOwnerProps.getProperty("PERSON_3_FIRST_NAME"),
                carOwnerProps.getProperty("PERSON_3_SECOND_NAME"),
                carOwnerProps.getProperty("PERSON_3_STATE_ID")
        );
        listOfTaxiCars.add(new TaxiCar(
                Integer.parseInt(carProps.getProperty("CAR_3_YEAR_MADE")),
                carProps.getProperty("CAR_3_MANUFACTURER"),
                carProps.getProperty("CAR_3_VIN_CODE"),
                carProps.getProperty("CAR_3_ENGINE_ID"),
                personCarOwner,
                carProps.getProperty("CAR_3_CAR_REGISTRATION_NUMBER"),
                CarCategory.CATEGORY_C,
                Integer.parseInt(carProps.getProperty("CAR_3_BOOK_VALUE")),
                Double.parseDouble(carProps.getProperty("CAR_3_FUEL_CONSUMPTION")),
                Integer.parseInt(carProps.getProperty("CAR_3_SPEED")),
                Integer.parseInt(carProps.getProperty("CAR_3_PRICE_PER_KILOMETER")))
        );

        personCarOwner = new Person(
                carOwnerProps.getProperty("PERSON_4_FIRST_NAME"),
                carOwnerProps.getProperty("PERSON_4_SECOND_NAME"),
                carOwnerProps.getProperty("PERSON_4_STATE_ID")
        );
        listOfTaxiCars.add(new TaxiCar(
                Integer.parseInt(carProps.getProperty("CAR_4_YEAR_MADE")),
                carProps.getProperty("CAR_4_MANUFACTURER"),
                carProps.getProperty("CAR_4_VIN_CODE"),
                carProps.getProperty("CAR_4_ENGINE_ID"),
                personCarOwner,
                carProps.getProperty("CAR_4_CAR_REGISTRATION_NUMBER"),
                CarCategory.CATEGORY_B,
                Integer.parseInt(carProps.getProperty("CAR_4_BOOK_VALUE")),
                Double.parseDouble(carProps.getProperty("CAR_4_FUEL_CONSUMPTION")),
                Integer.parseInt(carProps.getProperty("CAR_4_SPEED")),
                Integer.parseInt(carProps.getProperty("CAR_4_PRICE_PER_KILOMETER")))
        );

        personCarOwner = new Person(
                carOwnerProps.getProperty("PERSON_5_FIRST_NAME"),
                carOwnerProps.getProperty("PERSON_5_SECOND_NAME"),
                carOwnerProps.getProperty("PERSON_5_STATE_ID")
        );
        listOfTaxiCars.add(new TaxiCar(
                Integer.parseInt(carProps.getProperty("CAR_5_YEAR_MADE")),
                carProps.getProperty("CAR_5_MANUFACTURER"),
                carProps.getProperty("CAR_5_VIN_CODE"),
                carProps.getProperty("CAR_5_ENGINE_ID"),
                personCarOwner,
                carProps.getProperty("CAR_5_CAR_REGISTRATION_NUMBER"),
                CarCategory.CATEGORY_B,
                Integer.parseInt(carProps.getProperty("CAR_5_BOOK_VALUE")),
                Double.parseDouble(carProps.getProperty("CAR_5_FUEL_CONSUMPTION")),
                Integer.parseInt(carProps.getProperty("CAR_5_SPEED")),
                Integer.parseInt(carProps.getProperty("CAR_5_PRICE_PER_KILOMETER")))
        );

        personCarOwner = new Person(
                carOwnerProps.getProperty("PERSON_6_FIRST_NAME"),
                carOwnerProps.getProperty("PERSON_6_SECOND_NAME"),
                carOwnerProps.getProperty("PERSON_6_STATE_ID")
        );
        listOfTaxiCars.add(new TaxiCar(
                Integer.parseInt(carProps.getProperty("CAR_6_YEAR_MADE")),
                carProps.getProperty("CAR_6_MANUFACTURER"),
                carProps.getProperty("CAR_6_VIN_CODE"),
                carProps.getProperty("CAR_6_ENGINE_ID"),
                personCarOwner,
                carProps.getProperty("CAR_6_CAR_REGISTRATION_NUMBER"),
                CarCategory.CATEGORY_C,
                Integer.parseInt(carProps.getProperty("CAR_6_BOOK_VALUE")),
                Double.parseDouble(carProps.getProperty("CAR_6_FUEL_CONSUMPTION")),
                Integer.parseInt(carProps.getProperty("CAR_6_SPEED")),
                Integer.parseInt(carProps.getProperty("CAR_6_PRICE_PER_KILOMETER")))
        );

        personCarOwner = new Person(
                carOwnerProps.getProperty("PERSON_7_FIRST_NAME"),
                carOwnerProps.getProperty("PERSON_7_SECOND_NAME"),
                carOwnerProps.getProperty("PERSON_7_STATE_ID")
        );
        listOfTaxiCars.add(new TaxiCar(
                Integer.parseInt(carProps.getProperty("CAR_7_YEAR_MADE")),
                carProps.getProperty("CAR_7_MANUFACTURER"),
                carProps.getProperty("CAR_7_VIN_CODE"),
                carProps.getProperty("CAR_7_ENGINE_ID"),
                personCarOwner,
                carProps.getProperty("CAR_7_CAR_REGISTRATION_NUMBER"),
                CarCategory.CATEGORY_B,
                Integer.parseInt(carProps.getProperty("CAR_7_BOOK_VALUE")),
                Double.parseDouble(carProps.getProperty("CAR_7_FUEL_CONSUMPTION")),
                Integer.parseInt(carProps.getProperty("CAR_7_SPEED")),
                Integer.parseInt(carProps.getProperty("CAR_7_PRICE_PER_KILOMETER")))
        );

        return listOfTaxiCars;
    }
}
