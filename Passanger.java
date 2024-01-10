package com.hibernate.onetoone.assig.PROJECT_ASSIG;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passanger {
	@Id
	private int pId;
	private String pName;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Flight flight;
	
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Passanger [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
	

}
