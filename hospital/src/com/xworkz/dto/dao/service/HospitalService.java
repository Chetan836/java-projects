package com.xworkz.dto.dao.service;

import com.xworkz.dto.dao.HospitalDaoImplies;

@SuppressWarnings("unused")
public interface HospitalService {
	public boolean validateDetails(HospitalDto dto);
	public void display();
	public void display(String licenseNo,String phoneNo);
	public void updateDetails(String licenseNo,String phoneNo,String name);
	public void delete(String licenseNo);

}


