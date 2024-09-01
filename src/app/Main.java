package app;

public class Main {

    static int streetNumber = 12;
    static String streetName = "Victory";
    static String city = "Kyiv";
    static String state = "Kyiv";
    static int postCode = 41455;

    public static void main(String[] args) {

        User user = new User();
        Address address = new Address(15, "Carpenters Crossing", "Folcroft",
                "PA", 19032);
        System.out.println("Address of the class Address: " + address);
        user.setAddress(streetNumber,streetName,city,state,postCode);
        String userInfo = String.valueOf(user.getAddress());
        System.out.println("Address of the user: " + userInfo);
    }
}
