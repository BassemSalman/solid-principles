package SingleResponsibility;

/*
 * This class is only responsible for mapping users to DTOs
 * NOTICE: It's fine if we did this logic inside constructor of dto as well
 * in case it was as simple as data transfer only
 */

public class MappingUtils {
    public static UserDTO mapUserToDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setUsername(user.getUsername());
        return dto;
    }
}
