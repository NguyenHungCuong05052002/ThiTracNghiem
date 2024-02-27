
package SERVER.DAL.Mapper;

import SERVER.DTO.ExamDTO;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ExamMapper implements RowMapper<ExamDTO>{

    @Override
    public ExamDTO mapRow(ResultSet rs) {
        try {
            ExamDTO ex = new ExamDTO();
            ex.setId(rs.getInt("id"));

            ex.setSubject(rs.getNString("subject"));
            ex.setClass_room(rs.getNString("class_room"));
            ex.setQuantity(rs.getInt("quantity"));
            ex.setTotal_time(rs.getInt("total_time"));
            return ex;
        } catch (SQLException e) {
            return null;
        }
    }
}
