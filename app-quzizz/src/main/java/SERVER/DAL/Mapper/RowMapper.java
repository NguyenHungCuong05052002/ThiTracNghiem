
package SERVER.DAL.Mapper;


import java.sql.ResultSet;

public interface RowMapper<T> {
    T mapRow(ResultSet rs);
}
