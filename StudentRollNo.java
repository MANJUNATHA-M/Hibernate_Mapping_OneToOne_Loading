package com.hibernate1.onetoone.assg.OneToOneStudAssgi;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class StudentRollNo {
	@Id
	private int rNO;

	public int getrNO() {
		return rNO;
	}

	public void setrNO(int rNO) {
		this.rNO = rNO;
	}

	@Override
	public String toString() {
		return "StudentRollNo [rNO=" + rNO + "]";
	}
	

}
