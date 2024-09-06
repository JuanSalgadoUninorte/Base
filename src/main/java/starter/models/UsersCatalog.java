package starter.models;

public enum UsersCatalog {

    STANDARD_USER("standard_user","secret_sauce");

    public final String username;
    public final String password;

    UsersCatalog(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
