package app;

public class Address {

    private final int streetNumber;
    private final String streetName;
    private final String city;
    private final String state;
    private final int postCode;


    public Address(int streetNumber, String streetName, String city, String state, int postCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
