package com.xworkz.dto.dao.service;

public class HospitalTester {
	public static void main(String[] args) {
		HospitalDto dto=new HospitalDto("14536789", "apollo Hospital", "Ra jajinagar","promod" , "multispecality", "9620065562");
		HospitalDto dto1=new HospitalDto("25645279", "malya hospital", "indranagar","prabhakar" , "multispecality", "8050405922");
	    HospitalServiceImplies implies=new HospitalServiceImplies();
	    implies.validateDetails(dto1);
	    implies.display();
	    implies.display("25645279", "8050405922");
	    implies.updateDetails("25645279", "8050405922", "vikram");
	    implies.display();
	    implies.delete("25645279");
	    implies.display();
	    
	}

}
