package com.zdh.edu;

import static org.junit.Assert.assertEquals;



import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import com.zdh.mapper.StudentsMapper;
import com.zdh.pojo.Students;



/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
    public void testSelect()
    {
		InputStream inputStream = AppTest.class.getResourceAsStream("/mybatis-config.xml");
		//相当于根据mybatis-config.xml构建接池
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession相当于我们的Connection
		SqlSession session = sqlSessionFactory.openSession();
		try {
		
			StudentsMapper sm=session.getMapper(StudentsMapper.class);
			List<Students> stus=sm.findStudentsById(4);
			for(Students s:stus)
			{
				System.out.println(s.getStudId()+"\t"+s.getName()+"\t"+s.getEmail()+"\t"+s.getDob());
			}
			//assertEquals(3, stus.size());
			
	//		Asser.assertEquals(3, stus.size());
		} finally {
		 session.close();
		}
    }
	
	
	
	
	
	
	
	
	
	
	

}
