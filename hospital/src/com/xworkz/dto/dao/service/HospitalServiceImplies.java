package com.xworkz.dto.dao.service;

import com.xworkz.dto.dao.HospitalDaoImplies;

public class HospitalServiceImplies implements HospitalService {
	private HospitalDaoImplies hospital=new HospitalDaoImplies();

	@Override
	public boolean validateDetails(HospitalDto dto) {
		boolean isValid=true;
	if(dto.getLicenseNo()==null || dto.getLicenseNo().length()!=8){
		System.out.println("invalid license number");
       isValid=false;	
       return false;
	}
	if(dto.getName()==null || dto.getName().length()<6) {
		
		System.out.println("invalid name");
		isValid=false;
		return false;
	}
		if(dto.getFounder()==null || dto.getFounder().length()<4) {
			System.out.println("invalid founder");
			isValid=false;
			return false;
		}
		if(dto.getLocation()==null|| dto.getLocation().length()<6) {
	System.out.println("invalid location");
	isValid=false;
	return false;
	
	}
		if(dto.getSpecialized()==null || dto.getSpecialized().length()<6)
		{
			System.out.println("ivalid specaliziation");
			isValid=false;
			return false;
		}
		if(dto.getPhoneNo()==null || dto.getPhoneNo().length()!=10) {
			System.out.println("invalid phone no");
			isValid=false;
			return false;
			
		}
		if(isValid=true) {
			hospital.addDetails(dto);
	}
		return isValid;
		
					
	}

	@Override
	public void display() {
		System.out.println("inside display method");
    hospital.display();		
	}

	@Override
	public void display(String licenseNo, String phoneNo) {
    		System.out.println("inside display using licenseNo and phoneNo");
    		hospital.display(licenseNo, phoneNo);
 
	}
	@Override
	public void updateDetails(String licenseNo, String phoneNo, String name) {
		System.out.println("inside update method");
        hospital.updateDetails(licenseNo, phoneNo, name);     		
	}
    @Override
	public void delete(String licenseNo) {
		System.out.println("inside delete method");
	   hospital.delete(licenseNo);
	}
	} 

	