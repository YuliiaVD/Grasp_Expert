package app;

public class User {

    private Address address;

    public void setAddress(int streetNumber, String streetName, String city, String state, int postCode) {
        this.address = new Address(streetNumber, streetName, city, state, postCode);

    }

    public Address getAddress() {
        return address;
    }

}
