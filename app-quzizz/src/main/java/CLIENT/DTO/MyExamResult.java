
package CLIENT.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyExamResult {
    private int id;
    private int amount_correct;
    private int amount_incorrect;
    private  float time_doing;
    private float point;
    private int rank;
}
