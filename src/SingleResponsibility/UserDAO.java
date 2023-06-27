package SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

/*
    This class is purely to interact with database / file IO
    for the User class = user data access object
*/

public class UserDAO {
    public List<User> getAllUsers(){
        ArrayList<User> users = new ArrayList<User>();
        
        /*
         * Logic to fetch users let's say
         * We'll add dummy data
         */
        User u1 = new User("Name1", "Password");
        User u2 = new User("Name2", "Password");
        User u3 = new User("Name3", "Password");
        
        return List.of(u1,u2,u3);
    }

    public boolean exists(User user){

        /*
         * Logic to check for existence of such user in DB
         */

        boolean valid = true; // suppose its valid
        return valid;
    }

    public boolean signUp(User user){
        if(exists(user)){
            return false;
        }
        
        /*
         * Logic to insert user to db
         */

        return true;
    }

    public boolean logIn(User user){
        if(exists(user)){
            return true;
        }
        return true;
    }

}
