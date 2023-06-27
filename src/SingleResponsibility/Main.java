package SingleResponsibility;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        User u1 =  new User("Dummy", "Pass");
        
        UserDAO userDAO = new UserDAO();
        UserRegistationService registrationService = new UserRegistationService(userDAO);

        registrationService.signUp(u1);
        registrationService.logIn(u1);
        
        UserService service = new UserService(userDAO);
        List<UserDTO> users = service.getAllUsers();
    }
}
