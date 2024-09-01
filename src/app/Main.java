package app;

public class Main {

    static String userAddress = "Victory St.7";

    public static void main(String[] args) {

        User user = new User();
        Address address = new Address("Address of the class Address");
        System.out.println(address.getAddress());
        user.setAddress(userAddress);
        String getUserAddress = user.getAddress();
        System.out.println("Address of the user is: " + getUserAddress);
    }
}
