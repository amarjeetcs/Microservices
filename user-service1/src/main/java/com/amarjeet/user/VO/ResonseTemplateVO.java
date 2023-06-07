package com.amarjeet.user.VO;

import com.amarjeet.user.entity.User;

public class ResonseTemplateVO {
	private User user;
	private Department department;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public ResonseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResonseTemplateVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	@Override
	public String toString() {
		return "ResonseTemplateVO [user=" + user + ", department=" + department + "]";
	}

}
