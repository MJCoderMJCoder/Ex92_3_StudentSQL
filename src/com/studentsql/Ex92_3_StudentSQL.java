package com.studentsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex92_3_StudentSQL {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String strTemp = "";
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch(ClassNotFoundException e) {
		}
		try {
			con = DriverManager.getConnection("jdbc:odbc:student", "", "");
			stmt = con.createStatement();
		} catch(SQLException ee) {
			
		}
		strTemp = "CREATE TABLE student (id TEXT(20) PRIMARY KEY, name TEXT(20), gender TEXT(2), "
				+ "address TEXT(50), phone TEXT(20), major TEXT(20))";
		try {
			stmt.executeUpdate(strTemp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
