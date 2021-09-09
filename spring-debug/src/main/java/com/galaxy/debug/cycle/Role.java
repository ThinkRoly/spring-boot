package com.galaxy.debug.cycle;

/**
 * 角色
 * @author galaxy
 * @since 2021/8/19 23:08
 */
public class Role {
	private String name;

	private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
