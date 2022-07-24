package Models;

public class Address {
    Integer id;
    String country;
    String city;
    String street;

    public Address(Integer id, String country, String city, String street){
        this.id=id;
        this.country=country;
        this.city=city;
        this.street=street;
    }

    public Integer getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }
}
