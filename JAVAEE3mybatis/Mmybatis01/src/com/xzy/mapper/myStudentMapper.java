package com.xzy.mapper;

import java.util.List;

import com.xzy.pojo.Students;

public interface myStudentMapper {

	//��ѯ����ѧ��
	public List<Students> findAllStudents();
	//�ݾ�id��ѧ��
	//public Students findStudentById(Integer id);	
	//����һ��ѧ��
	//public void insertStudent(Students student);
}
