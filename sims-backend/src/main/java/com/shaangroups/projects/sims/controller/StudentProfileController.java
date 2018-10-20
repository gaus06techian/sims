package com.shaangroups.projects.sims.controller;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shaangroups.projects.sims.dto.StudentMasterDTO;
import com.shaangroups.projects.sims.service.StudentProfileService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class StudentProfileController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentProfileController.class);

	@Autowired
	private StudentProfileService studentProfileService;

	@RequestMapping(value = "/api/studentprofile", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllStudents() {
		List<StudentMasterDTO> studentMasterDTOList = studentProfileService.getAllStudents();
		if (studentMasterDTOList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		LOGGER.info("student master list size: " + studentMasterDTOList.size());
		return new ResponseEntity<List<StudentMasterDTO>>(studentMasterDTOList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/studentprofile/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStudentProfile(@PathVariable BigInteger id) {
		StudentMasterDTO studentMasterDTO = studentProfileService.getStudentById(id);
		if (null == studentMasterDTO) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<StudentMasterDTO>(studentMasterDTO, HttpStatus.OK);
	}
}
