package com.shaangroups.projects.sims.service;

import java.math.BigInteger;
import java.util.List;

import com.shaangroups.projects.sims.dto.StudentMasterDTO;

public interface StudentProfileService {

	List<StudentMasterDTO> getAllStudents();
	
	StudentMasterDTO getStudentById(BigInteger id);
	
}
