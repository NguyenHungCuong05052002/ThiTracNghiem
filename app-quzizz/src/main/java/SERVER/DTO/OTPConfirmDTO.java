
package SERVER.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class OTPConfirmDTO {
    private String email;
    private String otp;
}
