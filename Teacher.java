package com.hibernate.onetoone.assi.eagertolazy.onetoone.assi.eagertolazy;







import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
	@Id
	private int tId;
	private String tName;
	
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + "]";
	}
	


}

