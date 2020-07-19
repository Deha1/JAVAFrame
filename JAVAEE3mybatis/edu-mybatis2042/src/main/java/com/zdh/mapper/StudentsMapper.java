package com.zdh.mapper;

import java.util.List;

import com.zdh.pojo.Students;

public interface StudentsMapper {
	
	public List<Students> findAllStudents();
	
	public List<Students> findStudentsById(int id);
	

}
