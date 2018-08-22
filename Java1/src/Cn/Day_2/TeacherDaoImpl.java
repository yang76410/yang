package Cn.Day_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TeacherDaoImpl implements TeacherDao {
	static Map<Integer, TeacherForm> map;
	static {
		map = new HashMap<Integer, TeacherForm>();
		map.put(1001, new TeacherForm(1001, "zhang", "男"));
		map.put(1002, new TeacherForm(1002, "liu", "女"));
		map.put(1002, new TeacherForm(1002, "zhang", "男"));
	}

	public static void main(String[] args) {
		System.out.println(TeacherDaoImpl.map);
	}

	@Override
	public void add(TeacherForm teacherForm) {
		int id = (int) System.currentTimeMillis();
		
		teacherForm.setId(id);
		map.put(id, teacherForm);
	}

	@Override
	public void delete(int id) {
		map.remove(id);

	}
	@Override
	public void upddate(TeacherForm teacherForm) {
		map.put(teacherForm.getId(), teacherForm);

	}

	@Override
	public List<TeacherForm> queryAll() {
		List<TeacherForm> teacherForms = new ArrayList<TeacherForm>(map.values());
		return teacherForms;
	}

	@Override
	public TeacherForm getTeacher(int id) {
		return map.get(id);
	}
	@Test
	public void A() {
		System.out.println(map.get(1001));
	}
}
