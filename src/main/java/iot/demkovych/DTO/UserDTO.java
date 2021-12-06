package iot.demkovych.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private Integer age;
    private Integer countryId;
    private Integer libraryId;
}
