package com.pack.bluemaple.app.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;
import com.pack.bluemaple.app.model.model;

public class UserDao {

	public void connection() {
		try {

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insert(model m) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		// System.out.println(m.toString());
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/userdata", "root", "sathiesh9494");
		// Statement stmt = (Statement) con.createStatement();
		String query = ("INSERT INTO usersdata (userName,password,email,contact) values (?,?,?,?)");

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, m.getUserName());
		ps.setString(2, m.getPassword());
		ps.setString(3, m.getEmail());
		ps.setString(4, m.getContact());
		ps.executeUpdate();

		System.out.println("All Right , We got your entry");
		con.close();

	}

	public ArrayList<model> list() throws Exception, ClassNotFoundException {
		ArrayList<model> arraylist = new ArrayList<model>();
		{
			// System.out.println("the value");

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/userdata", "root",
					"sathiesh9494");
			java.sql.Statement stmt = con.createStatement();

			ResultSet rs = stmt
					.executeQuery("SELECT userId,userName,password,email,contact FROM usersdata ");

			while (rs.next()) {
				model m1 = new model();
				m1.setUserId(rs.getInt(1));
				m1.setUserName(rs.getString(2));
				m1.setPassword(rs.getString(3));
				m1.setEmail(rs.getString(4));
				m1.setContact(rs.getString(5));
				arraylist.add(m1);
				// System.out.println("hiiii");
				// System.out.println("   " + ids + "     " + Unam + "    " +
				// Pwds
				// + "    " + emails + "    " + conc );
			}

		}
		return arraylist;
	}

	public void update(model m) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		// System.out.println(m.toString());
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/userdata", "root", "sathiesh9494");
		Statement stmt = (Statement) con.createStatement();

		// String query = "UPDATE usersdata SET userName='"+ m.getUserName()+
		// "',password='"+ m.getPassword()+ "',email='"+ m.getEmail()+
		// "',contact='"+ m.getContact()+ "' where userId=" + m.getUserId();
		String query = "UPDATE usersdata SET password='" + m.getPassword()
				+ "',email='" + m.getEmail() + "',contact='" + m.getContact()
				+ "' where userName='" + m.getUserName() + "'";
		// Statement stmt2 = (Statement) con
		// .createStatement();
		stmt.executeUpdate(query);
		// TODO Auto-generated method stub

	}

	public void delete(model m) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/userdata", "root", "sathiesh9494");
		Statement stmt = (Statement) con.createStatement();
		String query = ("DELETE from userdata.usersdata  where userName='"
				+ m.getUserName() + "'");
		stmt.execute(query);
		// ResultSet rs= stmt.executeQuery(query);
		System.out.println("the value deleted.....");
	}

	
}
