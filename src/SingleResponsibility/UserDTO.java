package SingleResponsibility;

/*
 * This class is the client view representation of the user
 * Let's say we want to hide the password to the client
 * = user data transfer object
 */

public class UserDTO {

    private String username;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public UserDTO() {
    }

    public UserDTO(User user) {
        // mapping user to dto
        this.username = user.getUsername();
    }
    
}
