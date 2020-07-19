package com.xzy.edu;

import static org.junit.Assert.assertEquals;


import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xzy.pojo.Students;
import com.xzy.mapper.StudentMapper;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testSelect()
    {
		InputStream inputStream = AppTest.class.getResourceAsStream("/mybatis-config.xml");
		//相当于根据mybatis-config.xml构建接池
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession相当于我们的Connection
		SqlSession session = sqlSessionFactory.openSession();
		try {
		
			StudentMapper sm=session.getMapper(StudentMapper.class);
			List<Students> stus=sm.findAllStudents();
			for(Students s:stus)
			{
				System.out.println(s.getStud_id()+"\t"+s.getName()+"\t"+s.getEmail()+"\t"+s.getDob());
			}
			assertEquals(3, stus.size());
			
	//		Asser.assertEquals(3, stus.size());
		} finally {
		 session.close();
		}
		
    }
   
}
