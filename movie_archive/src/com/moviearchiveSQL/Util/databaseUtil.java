package com.moviearchiveSQL.Util;
import java.sql.*;
public class databaseUtil {
static Connection conn=null;

public static Connection Bağlan() {
	try {
		conn=DriverManager.getConnection("jdbc:mysql://localhost/film_arsiv","root","");
		return conn;
	}
	
		catch(Exception e) {
			System.out.println(e.getMessage().toString());
			return null;
		}
}

}
