package inheritance.tasks5_7;

public class Address {
    public int streetNumber;
    public String city;
    public String district;

    public Address(int streetNumber, String city, String district) {
        this.streetNumber = streetNumber;
        this.city = city;
        this.district = district;
    }

    class User{
       public String name;
       public Address address;
    }
}
