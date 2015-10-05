package com.demo.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
	
	private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

    @Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int getUserInfo(){
		String sql="select count(*) from contact";
		int count  = jdbcTemplate.queryForObject(sql, new Object[]{}, Integer.class);
		return count;
	}
}
