package app;

public class User {

    private Address address;

    public void setAddress(String address) {
        this.address = new Address(address);

    }

    public String getAddress() {
        return address.getAddress();
    }


}
