
package SERVER.DAL.Mapper;

import SERVER.DTO.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<UserDTO>{

    @Override
    public UserDTO mapRow(ResultSet rs) {
        try {
            UserDTO u = new UserDTO();
            u.setId(rs.getInt("id"));
            u.setEmail(rs.getString("email"));
            u.setPassword(rs.getString("password"));
            u.setName(rs.getString("name"));
            u.setRole(rs.getString("role"));
            u.setStatus(rs.getInt("status"));
            u.setGender(rs.getBoolean("gender"));
            u.setBirthday(rs.getTimestamp("birthday"));
            return u;
        } catch (SQLException e) {
            return null;
        }
    }
}
