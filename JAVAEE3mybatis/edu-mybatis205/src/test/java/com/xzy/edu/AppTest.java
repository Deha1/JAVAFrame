package com.xzy.edu;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xzy.mapper.StudentMapper;
import com.xzy.pojo.Students;



/**
 * Unit test for simple App.
 */
public class AppTest     
{
	@Test
    public void testADD()
    {

		InputStream inputStream = AppTest.class.getResourceAsStream("/mybatis-config.xml");
		//相当于根据mybatis-config.xml构建接池
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession相当于我们的Connection
		SqlSession session = sqlSessionFactory.openSession();
		try {
		
			StudentMapper sm=session.getMapper(StudentMapper.class);
			
			//增加
			Students stu=new Students();
			stu.setDob(new Date());
			stu.setEmail("Hello@163.com");
			stu.setName("小五");
			
			sm.insertStudent(stu);
			
			
			System.out.println("------------------------->"+stu.getStud_id());
			
			
		   session.commit();
			
			//查询
			
			

		} finally {
		 session.close();
		}
	
    }
}
