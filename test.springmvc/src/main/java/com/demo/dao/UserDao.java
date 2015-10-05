package com.demo.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
	 @Autowired
	private JdbcTemplate jdbcTemplate;
	public int getUserInfo(){
		String sql="select count(*) from contact";
		int count  = jdbcTemplate.queryForObject(sql, new Object[]{}, Integer.class);
		return count;
	}
}
