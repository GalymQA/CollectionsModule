package main;


public class Person {

    private String firstName;
    private String secondName;
    private String middleName;
    private String stateID;

    public Person() {
    }

    public Person(String firstName, String secondName, String stateID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.stateID = stateID;
    }

    public Person(String firstName, String secondName, String middleName, String stateID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.stateID = stateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getStateID() {
        return stateID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", stateID=" + stateID +
                '}';
    }

}
