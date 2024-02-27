
package SERVER.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
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

