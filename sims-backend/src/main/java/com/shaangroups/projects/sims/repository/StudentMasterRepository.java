package com.shaangroups.projects.sims.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaangroups.projects.sims.model.StudentMaster;

@Repository
public interface StudentMasterRepository extends JpaRepository<StudentMaster, BigInteger> {

}
