package com.xworkz.dto.dao;

import com.xworkz.dto.dao.service.HospitalDto;

public class HospitalDaoImplies implements HospitalDao {
	HospitalDto hospitaldto[]=new HospitalDto[3];
	int index=0;

	@Override
	public void addDetails(HospitalDto dto) {
		hospitaldto[index]=dto;
		index++;
		System.out.println("object added successfully");
	}

	@Override
	public void display() {
    for (int i = 0; i < index; i++) {
		if(hospitaldto[i]!=null) {
			System.out.println("License no is "+hospitaldto[i].getLicenseNo());
			System.out.println("hospital name is "+hospitaldto[i].getName());
			System.out.println("location is "+hospitaldto[i].getLocation());
			System.out.println("founder is "+hospitaldto[i].getFounder());
			System.out.println("specalized is "+hospitaldto[i].getSpecialized());
			System.out.println("phone no is"+hospitaldto[i].getPhoneNo());
			
		}
	}		
	}

	@Override
	public void display(String licenseNo, String phoneNo) {
    for (int i = 0; i < index; i++) {
           if(hospitaldto[i].getLicenseNo()==licenseNo && hospitaldto[i].getPhoneNo()==phoneNo) {
			System.out.println("License no is "+hospitaldto[i].getLicenseNo());
			System.out.println("hospital name is "+hospitaldto[i].getName());
			System.out.println("location is "+hospitaldto[i].getLocation());
			System.out.println("founder is "+hospitaldto[i].getFounder());
			System.out.println("specalized is "+hospitaldto[i].getSpecialized());
			System.out.println("phone no is"+hospitaldto[i].getPhoneNo());
			
			
		}else {
			System.out.println("invalid license no and phone no");
		}
	}		
	}

	@Override
	public void updateDetails(String licenseNo, String phoneNo, String name) {
    for (int i = 0; i < index; i++) {
    	if(hospitaldto[i].getLicenseNo()==licenseNo && hospitaldto[i].getPhoneNo()==phoneNo) {
		hospitaldto[i].setName(name);
	}		
	}
	
}

	@Override
	public void delete(String licenseNo) {
    for (int i = 0; i < index; i++) {
    	if(hospitaldto[i].getLicenseNo()==licenseNo) {
    		hospitaldto[i]=null;

    	}
		
	}		
	}
}
