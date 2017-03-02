package dispensable.dataclasses;

public class Customer {
    private String title;
    private String firstName;
    private String lastName;
    private Address address;

    public Customer(String title, String firstName, String lastName, Address address) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
