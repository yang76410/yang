package Cn.Day_3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

import Cn.Day_2.StuForm;

public class TesgLog {
	private Logger logger = Logger.getLogger(TesgLog.class);
	@Test
	public void tt() {
		StuForm form=new StuForm();
		form.setId(1002);
		form.setName("zhang");
		//判断对象是否生成
		 logger.debug("form:"+form);
		 Map<Integer, StuForm> map=null;
		 logger.debug("map："+map);//集合是否生成
		 try {
			 map.put(1002, form);
			 logger.debug("map："+map);//对象是否存在于集合
		 }catch (Exception e) {
			logger.error(e);
		}
	}
}
