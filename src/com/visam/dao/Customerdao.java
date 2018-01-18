package com.visam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customerdao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Bookdb", "postgres",
					"postgres");
			System.out.println("Connection Successful");
			Statement stmt = con.createStatement();

			stmt = con.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS Customer " + "(userId INT PRIMARY KEY     NOT NULL,"
					+ " cName  TEXT    			 NOT NULL, " + " cEmail TEXT     		     NOT NULL)";

			String books = "CREATE TABLE IF NOT EXISTS Book " + "(id 		INT PRIMARY KEY 	NOT NULL,"
					+ " bookName TEXT 				NOT NULL, " + " author 	TEXT 				NOT NULL, "
					+ " price 	FLOAT 				NOT NULL)";

			stmt.executeUpdate(sql);
			stmt.executeUpdate(books);
			String sql1 = "INSERT INTO Customer(userId, cName, cEmail)"
					+ "VALUES (1000, 'Charita', 'charita.gorijala@gmail.com');";

			String bookIns = "INSERT INTO Book(id, bookName, author, price)"
					+ "VALUES (101, 'A Meditation Guide Book', 'Oprah Winfrey', 16.05);";

			stmt.executeUpdate(sql1);
			stmt.executeUpdate(bookIns);

			stmt.close();
			con.close();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
