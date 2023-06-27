package SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

/*
 * Class used for User management and interaction 
 * It encapsulates User into UserDTO in case of returning data
 */

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO){
        this.userDAO=userDAO;
    }

    public List<UserDTO> getAllUsers(){
        List<User> users = userDAO.getAllUsers();
        List<UserDTO> userDTOs = new ArrayList<>();

        for(User user : users){
            userDTOs.add(new UserDTO(user));
        }
        return userDTOs;
    }
    
}
