package com.pack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//import javax.servlet.RequestDispatcher;

import com.Model.User;

public class Process {

	public int login(User u) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 1;
		// String a = null;
		String uname = u.getUsername();
		String upass = u.getPassword();
		int role = 2;
		int roll = 1;
		Connection conn = null;
		Data d1 = new Data();
		try {
			conn = d1.getConnection();

			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("Select Username,Password,Role_Roleid from userdetail");
			while (rs.next()) {

				String user = rs.getString("Username");
				String pass = rs.getString("Password");
				int roles = rs.getInt("Role_Roleid");
				// a="select Roleid from role";
				// int a=1;

				if (a == (roles)) {
					if (uname.equals(user) && upass.equals(pass)
							&& role == (roles)) {
						return a;
					}

				}
				if (b == (roles)) {

					if (uname.equals(user) && upass.equals(pass)
							&& roles == (roll)) {

						
						return b;

					}
				}
				else{
					System.out.println("Invalid Login");
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
		

	}
}
