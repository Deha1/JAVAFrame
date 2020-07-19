package com.xzy.main;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xzy.mapper.myStudentMapper;
import com.xzy.pojo.Students;


public class myMain {
	public static void main(String[] args) 
	{
	
		InputStream inputStream = myMain.class.getResourceAsStream("/mybatis-config.xml");
		//�൱�ڸ���mybatis-config.xml�����ӳ�
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession�൱�����ǵ�Connection
		SqlSession session = sqlSessionFactory.openSession();
		try {
		
			myStudentMapper sm=session.getMapper(myStudentMapper.class);
			
			//����
			Students stu=new Students();
			stu.setDob(new Date());
			stu.setEmail("Hello@163.com");
			stu.setName("����");
			
			sm.insertStudent(stu);
			
		   session.commit();
			
			//��ѯ
			
			List<Students> stus=sm.findAllStudents();
			for(Students s:stus)
			{
				System.out.println(s.getStud_id()+"\t"+s.getName()+"\t"+s.getEmail()+"\t"+s.getDob());
			}

		} finally {
		 session.close();
		}
		
	}

}
