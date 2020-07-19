package com.xzy.edu;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xzy.mapper.StudentMapper;
import com.xzy.pojo.Stu;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testOne2ont()
	{
		InputStream inputStream = AppTest.class.getResourceAsStream("/mybatis-config.xml");
		SqlSessionFactory sqlsessionfactory =new SqlSessionFactoryBuilder().build(inputStream);
		// SqlSession相当于我们的Connection
		SqlSession session = sqlsessionfactory.openSession();
		try {
			StudentMapper sm = session.getMapper(StudentMapper.class);
			List<Stu> stus = sm.findAllStu01();
			
			for(Stu s:stus)
			{	
				System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getSex()+"\t"+s.getAge()+"\t"+s.getScore().getEnglish()+"\t"+s.getScore().getMath()+"\t"+s.getScore().getPe());
			}
			
			//查询
			
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
	}

}
