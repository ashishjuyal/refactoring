package dispensable.dataclasses;

public class Address {
    private String city;
    private String postCode;
    private String country;

    public Address(String city, String postCode, String country) {
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }
}
