
package SERVER.DAL.Mapper;

import SERVER.DTO.ResultDTO;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ResultMapper implements RowMapper<ResultDTO>{

    @Override
    public ResultDTO mapRow(ResultSet rs) {
        try {
            ResultDTO result = new ResultDTO();
            result.setId(rs.getInt("id"));

            result.setScore(rs.getFloat("score"));
            return result;
        } catch (SQLException e) {
            return null;
        }
    }
}

