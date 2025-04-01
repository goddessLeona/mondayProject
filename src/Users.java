public abstract class Users {

    private String username;
    private String firstName;
    private String lastname;
    private String userId;

    public Users(String username, String firstName, String lastname, String userId) {
        this.username = username;
        this.firstName = firstName;
        this.lastname = lastname;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUserId() {
        return userId;
    }


    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
