
package CLIENT.DTO;

import lombok.*;

import java.util.Date;



@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {
    private Integer id;
    private String email;
    private String password;
    private String name;
    private Integer status;
    private Boolean gender;
    private Date birthday;
    private String role;
}
