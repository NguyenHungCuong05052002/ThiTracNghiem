
package SERVER.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import lombok.AllArgsConstructor;



@Getter 
@Setter 
@NoArgsConstructor
public class ExamDTO {
    private Integer id;
    private int userID;
    private String subject;
    private String class_room;
    private Integer quantity;
    private int status;
    private Integer total_time;
}
