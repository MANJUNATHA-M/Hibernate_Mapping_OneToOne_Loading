package com.hibernate.onetoone.assig.PROJECT_ASSIG;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Flight {
   @Id
	private int fId;
	private String fName;
	

	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	@Override
	public String toString() {
		return "Flight [fId=" + fId + ", fName=" + fName + "]";
	}

}
