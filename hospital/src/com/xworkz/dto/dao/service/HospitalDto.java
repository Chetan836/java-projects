package com.xworkz.dto.dao.service;

public class HospitalDto {
	private String licenseNo;
	private String name;
	private String location;
	private String founder;
	private String specialized;
	private String phoneNo;
	public HospitalDto(String licenseNo, String name, String location, String founder, String specialized,
			String phoneNo) {
		System.out.println("inside constructor");
		this.licenseNo = licenseNo;
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.specialized = specialized;
		this.phoneNo = phoneNo;
	}

	public HospitalDto() {
		System.out.println("default or no argument constructor created");
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
