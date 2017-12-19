package com.springbatch.ejemplo1;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.springbatch.ejemplo1.StudentDTO;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDTO customer = new StudentDTO();
		customer.setName(rs.getString("UserId"));
		customer.setEmailAddress(rs.getString("UserId"));
		return customer;
	}
}