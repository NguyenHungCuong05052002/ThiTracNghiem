
package CLIENT.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
      private Integer id;
    private Integer examID;
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String answer;
}
