package SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

/*
 * Class used for User registration 
 * It encapsulates User into UserDTO in case of returning data
 */

public class UserRegistationService {
    
    private UserDAO userDAO;

    public UserRegistationService(UserDAO userDAO){
        this.userDAO=userDAO;
    }

    
    public boolean logIn(User user){
        if(userDAO.logIn(user)){
            return true;
        }
        return false;
    }

    public boolean signUp(User user){
        if(userDAO.signUp(user)){
            return true;
        }
        return false;
    }
}
