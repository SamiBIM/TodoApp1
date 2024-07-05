package se.lexicon;

import java.util.Objects;

public class AppUser {

    private String username;
    private String password;
    private AppRole role;

    public AppUser() {

    }

    public AppUser(String username) {
        this.username = username;
    }

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        validateThis(username, "username");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validateThis(password, "password");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) {
            throw new IllegalArgumentException("not allowed to be null");
        }
        this.role = role;
    }

    //universal validation method for null to be used inside different setters
    //inputstring is a variable name that we use to check/validate the entered data
    private void validateThis(String inputString, String variableName) throws IllegalArgumentException {
        if (inputString == null) {
            throw new IllegalArgumentException(variableName + " not allowed to  be null");
        } else if (inputString.isEmpty()) {
            throw new IllegalArgumentException(variableName + " not allowed to  be empty");
        }/* else if (inputString.isBlank()) {
            throw new IllegalArgumentException(variableName + " not allowed to  be blank");
        }*/
    }


    //compares if the entered data are equal or identical, doesnt check the objectname, just the values
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AppUser inputObject = (AppUser) object;
        return Objects.equals(getUsername(), inputObject.getUsername())
                && getRole() == inputObject.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getRole());
    }

    //For printing the entered object and overriding the hashcode which returns the address
    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}
