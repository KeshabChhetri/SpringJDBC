package com.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class MobileDetails {
	
	private JdbcTemplate jdbcTemplate;

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
/*
	public int insertMobile(Mobile m) {
		String query = "insert into mobile values("+m.getMid()+",'"+m.getMname()+"',"+m.getMprice()+")";
		int x = jdbcTemplate.update(query);
		return x; 
		}
		
	
	public int upadteMobile(Mobile m) {
		String query = "insert into mobile values("+m.getMid()+",'"+m.getMname()+"',"+m.getMprice()+")";
		int x = jdbcTemplate.update(query);
		return x; 
	}
	
	public int deleteMobile(Mobile m) {
		String query = "delete from mobile where Mid = "+m.getMid()+"";
		int x = jdbcTemplate.update(query);
		return x; 
	}
	
	//public boolean insertMobile(final Mobile m) {
	
	// public boolean updateMobile(final Mobile m) {
	 * 
	 */
	public boolean deleteMobile(final Mobile m) {


		
		//String query ="insert into mobile values(?,?,?)";
		//String query ="update mobile set mname =?,mprice = ? where mid=?";
		String query ="delete from mobile where mid=?";

		

		jdbcTemplate.execute(query, new PreparedStatementCallback <Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1, m.getMid());
				//ps.setString(1,m.getMname());
				
				//ps.setLong(2,m.getMprice());
				
				return ps.execute();
			}
			
		});
				
				return true;
		
		
	}

	
	
	
	
	
}
