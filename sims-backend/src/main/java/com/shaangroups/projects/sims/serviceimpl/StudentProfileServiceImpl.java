package com.shaangroups.projects.sims.serviceimpl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaangroups.projects.sims.dto.StudentMasterDTO;
import com.shaangroups.projects.sims.model.StudentMaster;
import com.shaangroups.projects.sims.modelmapper.StudentMasterModelMapper;
import com.shaangroups.projects.sims.repository.StudentMasterRepository;
import com.shaangroups.projects.sims.service.StudentProfileService;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

	@Autowired
	private StudentMasterRepository studentMasterRepo;
	
	@Autowired
	private StudentMasterModelMapper studentMasterModelMapper;
	
	@Override
	public List<StudentMasterDTO> getAllStudents() {
		List<StudentMaster> studentMasterList = studentMasterRepo.findAll();
		List<StudentMasterDTO> studentMasterDTOList = new ArrayList<>();
		for (StudentMaster entity : studentMasterList) {
			studentMasterDTOList.add(studentMasterModelMapper.entityToDTO(entity));
		}
		return studentMasterDTOList;
	}

	@Override
	public StudentMasterDTO getStudentById(BigInteger id) {
		Optional<StudentMaster> studentMaster = studentMasterRepo.findById(id);
		return studentMasterModelMapper.entityToDTO(studentMaster.get());
	}

}
