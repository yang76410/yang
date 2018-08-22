package Cn.Day_2;

import java.util.List;

public interface TeacherDao {
	void add(TeacherForm teacherForm);

	void delete(int id);

	void upddate(TeacherForm teacherForm);

	List<TeacherForm> queryAll();

	TeacherForm getTeacher(int id);

}
