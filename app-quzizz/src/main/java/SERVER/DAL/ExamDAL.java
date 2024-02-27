
package SERVER.DAL;

import SERVER.DAL.Mapper.ExamMapper;
import SERVER.DTO.ExamDTO;
import SERVER.DTO.FullDataExamDTO;

import java.io.FileNotFoundException;
import java.util.List;

public class ExamDAL extends AbstractDAL<ExamDTO> {

    public ExamDTO getById(int id_exam) {
        ExamDAL exam = new ExamDAL();
        String  sql = "SELECT * FROM `exams` WHERE id = ?";
        List<ExamDTO> temp = exam.query(sql, new ExamMapper(), id_exam);
        ExamDTO result = temp.get(0);
        return result;
    }

    public Integer save(ExamDTO exam) throws FileNotFoundException {
        StringBuilder sql = new StringBuilder("INSERT INTO exams(user_id, subject, class_room, quantity, status, total_time)");
        sql.append(" VALUES(?, ?, ?, ?, ?, ?)");
        return insert(sql.toString(),exam.getUserID(),
                exam.getSubject(), exam.getClass_room(),
                exam.getQuantity(), exam.getStatus(),
                exam.getTotal_time());
    }

    public List<ExamDTO> findAll() {
        String sql = "SELECT * from exams where quantity > 0 and status =1";
        return query(sql, new ExamMapper());
    }

    public List<ExamDTO> findByUser(int userId) {
        String sql = "SELECT * from exams where status =1 and user_id=" + userId;
        return query(sql, new ExamMapper());
    }
    
    public void delete(int exam_id) throws FileNotFoundException {
        String sql = "DELETE FROM exams WHERE id = ? ";
        update(sql, exam_id);
    }

    public void updateStatus(int status,int exam_id) throws FileNotFoundException {
        StringBuilder sql = new StringBuilder("UPDATE exams SET status = ? ");
        sql.append("WHERE id = ?");
        update(sql.toString(), status, exam_id);
    }

    public void update(FullDataExamDTO exam) throws FileNotFoundException {
        StringBuilder sql = new StringBuilder("UPDATE exams SET subject = ?, class_room = ?, quantity = ?, status = ?, total_time = ?, user_id = ? ");
        sql.append("WHERE id = ?");
        update(sql.toString(), exam.getSubject(),
                exam.getClass_room(), exam.getQuantity(),
                exam.getStatus(), exam.getTotal_time(),
                exam.getUserID(),
                exam.getId());
    }

}