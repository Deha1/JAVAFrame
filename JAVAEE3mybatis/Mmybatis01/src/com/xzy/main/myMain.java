package com.xzy.main;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xzy.mapper.myStudentMapper;
import com.xzy.pojo.Students;

public class myMain {

	public static void main(String[] args) {
		
		InputStream inputstream = myMain.class.getResourceAsStream("/mybatis-config.xml");
		//相当于根据mybatis-config.xml构建接池
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputstream);
		
		// SqlSession相当于我们的Connection
		SqlSession sqlsession = sqlSessionFactory.openSession();
		try {
			myStudentMapper sm = sqlsession.getMapper(myStudentMapper.class);
			List<Students> stus = sm.findAllStudents();
			for(Students s:stus)
			{
				System.out.println(s.getStud_id()+"\t"+s.getName()+"\t"+s.getEmail()+"\t"+s.getDob());
			}
					
		} finally {
			sqlsession.close();
			// TODO: handle finally clause
		}
	}

}
