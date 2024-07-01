package se.lexicon;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person() {
    }

    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        validateThis(firstName, "First name");
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        validateThis(lastName, "Last name");
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setEmail(String email) {
        validateThis(email, "Email");
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    private void validateThis(String inputString, String variableName) {
        if (inputString == null) {
            throw new IllegalArgumentException(variableName + " not allowed to  be null");
        }
    }

    public String getSummary() {
        return "{ id : " + id + " , name : " + firstName + " " + lastName + " , email : " + email + " }";
    }

}
