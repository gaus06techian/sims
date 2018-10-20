package com.shaangroups.projects.sims.modelmapper;

import org.springframework.context.annotation.Configuration;

import com.shaangroups.projects.sims.dto.StudentMasterDTO;
import com.shaangroups.projects.sims.model.StudentMaster;

@Configuration
public class StudentMasterModelMapper {

	public StudentMasterDTO entityToDTO(StudentMaster entity) {
		StudentMasterDTO dto = new StudentMasterDTO();
		dto.setId(entity.getId());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setPlaceOfBirth(entity.getPlaceOfBirth());
		dto.setNationality(entity.getNationality());
		dto.setGender(entity.getGender());
		dto.setMotherTongue(entity.getMotherTongue());
		
		dto.setParentOneDateOfBirth(entity.getParentOneDateOfBirth());
		dto.setParentOneFirstName(entity.getParentOneFirstName());
		dto.setParentOneGender(entity.getParentOneGender());
		dto.setParentOneJob(entity.getParentOneJob());
		dto.setParentOneLastName(entity.getParentOneLastName());
		dto.setParentOneMobile(entity.getParentOneMobile());
		dto.setParentOneNationality(entity.getParentOneNationality());
		dto.setParentOnePlaceOfBirth(entity.getParentOnePlaceOfBirth());
		
		dto.setParentTwoDateOfBirth(entity.getParentTwoDateOfBirth());
		dto.setParentTwoFirstName(entity.getParentTwoFirstName());
		dto.setParentTwoGender(entity.getParentTwoGender());
		dto.setParentTwoJob(entity.getParentTwoJob());
		dto.setParentTwoLastName(entity.getParentTwoLastName());
		dto.setParentTwoMobile(entity.getParentTwoMobile());
		dto.setParentTwoNationality(entity.getParentTwoNationality());
		dto.setParentTwoPlaceOfBirth(entity.getParentTwoPlaceOfBirth());
		
		return dto;
	}
}
