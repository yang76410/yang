package Cn.Day_2;

import org.junit.Test;


public class TeacherDaoImplTest {
	TeacherDao dao=new TeacherDaoImpl();

	@Test
	public void testAdd() {
		dao.add(new TeacherForm( "张三", "男"));
		testQueryAll();
	}

	@Test
	public void testDelete() {
		dao.delete(1001);
		testQueryAll();
	}

	@Test
	public void testUpddate() {
		dao.upddate(new TeacherForm(1001,  "张三", "男"));
		testQueryAll();
	}

	@Test
	public void testQueryAll() {
		System.out.println(dao.queryAll());
	}

	@Test
	public void testGetTeacher() {
		System.out.println(dao.getTeacher(1001));
	}
}
