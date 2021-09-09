package com.galaxy.debug.cycle;

/**
 * 用户
 * @author galaxy
 * @since 2021/8/19 23:06
 */
public class User {
	private String name;

	private Role role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
