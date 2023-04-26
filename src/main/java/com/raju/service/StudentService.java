package com.raju.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.Student;
import com.raju.entity.Studententity;
import com.raju.repo.StudentRepo;


@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	public boolean saveStudent(Student student) {
		Studententity entity=new Studententity();
		System.out.println(entity);
		BeanUtils.copyProperties(student, entity);
		System.out.println(student);
		entity.setTime(Arrays.toString(student.getTime()));
		repo.save(entity);
		return true;
		
	}

	public List<String> courseList(){
		return Arrays.asList("Java","Phython","Aws","Devops","DS");
	}
public List<String> getTiming(){
	return Arrays.asList("Morning","Afternoon","Evening");
}
}
