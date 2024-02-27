
package SERVER.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO {
    private Integer id;
    private int examID;
    private int userID;
    private float score;
}
