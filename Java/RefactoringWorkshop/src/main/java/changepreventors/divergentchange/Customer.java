package changepreventors.divergentchange;

public class Customer {
    private String firstName;
    private String lastName;
    private String title;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toXML() {
        return "<customer>" +
                    "<firstName>" + getFirstName() + "</firstName>" +
                    "<lastName>" + getLastName() + "</lastName>" +
                    "<title>" + getTitle() + "</title>" +
                "</customer";
    }

    public String toJSON() {
        return "{" +
                    "firstName: " + getFirstName() + "," +
                    "lastName:" + getLastName() + "," +
                    "title:" + getTitle() +
                "}";
    }


}
