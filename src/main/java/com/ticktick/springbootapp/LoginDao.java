package com.ticktick.springbootapp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String checkUser(String username,String password) {
		//HERE WE CAN WRITE DATABASE LOGIC TO CHECK EITHER USER
		//IS IN THE DATABASE OR NOT
		String role="unknown";
		String sql="select role from login_tbl where username=? and password=?";
		List<String> roleList=jdbcTemplate.queryForList(sql,new Object[] {username,password},String.class);
		if(roleList.size()>0) {
			role= roleList.get(0);
		}
		return role;
	}
}
