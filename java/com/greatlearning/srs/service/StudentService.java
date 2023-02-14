package com.greatlearning.srs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.model.Acl;
import org.springframework.security.acls.model.AclService;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.security.acls.model.ObjectIdentity;
import org.springframework.security.acls.model.Sid;
import org.springframework.stereotype.Service;

import com.greatlearning.srs.model.Student;
import com.greatlearning.srs.repository.StudentRepository;

@Service
public class StudentService implements AclService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	public void save(Student student) {
		  studentRepository.save(student);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}

	@Override
	public List<ObjectIdentity> findChildren(ObjectIdentity parentIdentity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acl readAclById(ObjectIdentity object) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acl readAclById(ObjectIdentity object, List<Sid> sids) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<ObjectIdentity, Acl> readAclsById(List<ObjectIdentity> objects) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<ObjectIdentity, Acl> readAclsById(List<ObjectIdentity> objects, List<Sid> sids)
			throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}