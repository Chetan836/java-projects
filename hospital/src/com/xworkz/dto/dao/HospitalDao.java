package com.xworkz.dto.dao;

import com.xworkz.dto.dao.service.HospitalDto;

public interface HospitalDao {
	
	public void addDetails(HospitalDto dto);
	public void display();
    public void display(String licenseNo,String phoneNo);
    public void updateDetails(String licenseNo,String phoneNo,String name);
    public void delete(String licenseNo);
    
} 