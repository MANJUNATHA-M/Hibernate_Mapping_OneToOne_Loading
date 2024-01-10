package com.hibernate.onetoone.assi.eagertolazy.onetoone.assi.eagertolazy;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Teacher teacher;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", teacher=" + teacher + "]";
	}

	

}
