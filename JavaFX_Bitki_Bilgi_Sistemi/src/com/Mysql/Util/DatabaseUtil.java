package com.Mysql.Util;
import java.sql.*;
public class DatabaseUtil {

	static Connection conn = null;
	
	public static Connection baglan() {
		try {
			
			//"jdbc:mysql://ServerIpAdresi/db_ismi" , "kullanici","sifre"
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bitkivt","root","ozkan");
			
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			return null;
		}
	}
}
