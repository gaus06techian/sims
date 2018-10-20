package com.shaangroups.projects.sims.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_master")
public class StudentMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	@Column(name = "fname")
	private String firstName;

	@Column(name = "lname")
	private String lastName;

	@Column(name = "dob")
	private String dateOfBirth;

	@Column(name = "pob")
	private String placeOfBirth;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "gender")
	private char gender;

	@Column(name = "mother_tongue")
	private String motherTongue;

	@Column(name = "p1_fname")
	private String parentOneFirstName;

	@Column(name = "p1_lname")
	private String parentOneLastName;

	@Column(name = "p1_dob")
	private String parentOneDateOfBirth;

	@Column(name = "p1_pob")
	private String parentOnePlaceOfBirth;

	@Column(name = "p1_nationality")
	private String parentOneNationality;

	@Column(name = "p1_mobile")
	private String parentOneMobile;

	@Column(name = "p1_gender")
	private char parentOneGender;

	@Column(name = "p1_job")
	private String parentOneJob;

	@Column(name = "p2_fname")
	private String parentTwoFirstName;

	@Column(name = "p2_lname")
	private String parentTwoLastName;

	@Column(name = "p2_dob")
	private String parentTwoDateOfBirth;

	@Column(name = "p2_pob")
	private String parentTwoPlaceOfBirth;

	@Column(name = "p2_nationality")
	private String parentTwoNationality;

	@Column(name = "p2_mobile")
	private String parentTwoMobile;

	@Column(name = "p2_gender")
	private char parentTwoGender;

	@Column(name = "p2_job")
	private String parentTwoJob;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getParentOneFirstName() {
		return parentOneFirstName;
	}

	public void setParentOneFirstName(String parentOneFirstName) {
		this.parentOneFirstName = parentOneFirstName;
	}

	public String getParentOneLastName() {
		return parentOneLastName;
	}

	public void setParentOneLastName(String parentOneLastName) {
		this.parentOneLastName = parentOneLastName;
	}

	public String getParentOneDateOfBirth() {
		return parentOneDateOfBirth;
	}

	public void setParentOneDateOfBirth(String parentOneDateOfBirth) {
		this.parentOneDateOfBirth = parentOneDateOfBirth;
	}

	public String getParentOnePlaceOfBirth() {
		return parentOnePlaceOfBirth;
	}

	public void setParentOnePlaceOfBirth(String parentOnePlaceOfBirth) {
		this.parentOnePlaceOfBirth = parentOnePlaceOfBirth;
	}

	public String getParentOneNationality() {
		return parentOneNationality;
	}

	public void setParentOneNationality(String parentOneNationality) {
		this.parentOneNationality = parentOneNationality;
	}

	public String getParentOneMobile() {
		return parentOneMobile;
	}

	public void setParentOneMobile(String parentOneMobile) {
		this.parentOneMobile = parentOneMobile;
	}

	public char getParentOneGender() {
		return parentOneGender;
	}

	public void setParentOneGender(char parentOneGender) {
		this.parentOneGender = parentOneGender;
	}

	public String getParentOneJob() {
		return parentOneJob;
	}

	public void setParentOneJob(String parentOneJob) {
		this.parentOneJob = parentOneJob;
	}

	public String getParentTwoFirstName() {
		return parentTwoFirstName;
	}

	public void setParentTwoFirstName(String parentTwoFirstName) {
		this.parentTwoFirstName = parentTwoFirstName;
	}

	public String getParentTwoLastName() {
		return parentTwoLastName;
	}

	public void setParentTwoLastName(String parentTwoLastName) {
		this.parentTwoLastName = parentTwoLastName;
	}

	public String getParentTwoDateOfBirth() {
		return parentTwoDateOfBirth;
	}

	public void setParentTwoDateOfBirth(String parentTwoDateOfBirth) {
		this.parentTwoDateOfBirth = parentTwoDateOfBirth;
	}

	public String getParentTwoPlaceOfBirth() {
		return parentTwoPlaceOfBirth;
	}

	public void setParentTwoPlaceOfBirth(String parentTwoPlaceOfBirth) {
		this.parentTwoPlaceOfBirth = parentTwoPlaceOfBirth;
	}

	public String getParentTwoNationality() {
		return parentTwoNationality;
	}

	public void setParentTwoNationality(String parentTwoNationality) {
		this.parentTwoNationality = parentTwoNationality;
	}

	public String getParentTwoMobile() {
		return parentTwoMobile;
	}

	public void setParentTwoMobile(String parentTwoMobile) {
		this.parentTwoMobile = parentTwoMobile;
	}

	public char getParentTwoGender() {
		return parentTwoGender;
	}

	public void setParentTwoGender(char parentTwoGender) {
		this.parentTwoGender = parentTwoGender;
	}

	public String getParentTwoJob() {
		return parentTwoJob;
	}

	public void setParentTwoJob(String parentTwoJob) {
		this.parentTwoJob = parentTwoJob;
	}

}
