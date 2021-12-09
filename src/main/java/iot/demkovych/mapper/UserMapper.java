package iot.demkovych.mapper;

import iot.demkovych.DTO.UserDTO;
import iot.demkovych.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper<User, UserDTO> {
    @Override
    public UserDTO mapObjectToDto (User user) {
        UserDTO.UserDTOBuilder userDTOBuilder = UserDTO.builder();
        userDTOBuilder.id(user.getId());
        userDTOBuilder.name(user.getName());
        userDTOBuilder.lastName(user.getLastName());
        userDTOBuilder.email(user.getEmail());
        userDTOBuilder.age(user.getAge());
        userDTOBuilder.countryId(user.getCountryId());
        userDTOBuilder.libraryId(user.getLibraryId());
        return userDTOBuilder.build();
    }
}