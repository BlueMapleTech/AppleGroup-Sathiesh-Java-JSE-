package com.user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class menu {
	public static void main(String arg[]) throws Exception {
		System.out.println("enter the option:");
		System.out.println("1.Login");
		System.out.println("2.Signup");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("5.List");
		System.out.println("6.exit");
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.println("Select the option:");
		int option = scr.nextInt();
		if (option == 1) {
			login();
		} else if (option == 2) {
			signup();
		} else if (option == 3) {
			update();
		} else if (option == 4) {
			delete();
		} else if (option == 5) {
			list();
		} else if (option == 6) {
			exit();
		}
	}

	private static void login() throws Exception {
		@SuppressWarnings("unused")
		boolean login = false;
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the username:");
		String uname = scr.nextLine();
		System.out.println("enter the password");
		String pword = scr.nextLine();
		// String s;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn2 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/userdata", "root",
					"sathiesh9494");
			Statement stmt2 = conn2.createStatement();

			ResultSet rs = stmt2.executeQuery("select * from usersdetails ");
			while (rs.next()) {
				String user1 = rs.getString("Name");
				String pword1 = rs.getString("Password");

				if ((uname.equals(user1)) && (pword.equals(pword1))) {
					System.out.println("login sucess");
					login = true;
				} else {
					login = false;
					System.out.println("invalid login");
				}
			}
			conn2.close();
		}

		catch (Exception err) {
			System.out.println("ERROR: " + err);
		}
	}

	private static void signup() throws Exception {
		System.out.println("Welcome to Your database");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your user_id");
		int id1 = Integer.parseInt(br.readLine());
		System.out.println("Enter your UserName");
		String Uname = br.readLine();
		System.out.println("Welcome" + " " + Uname);

		System.out.println("Enter your Password");
		String pwd = br.readLine();

		System.out.println("Enter your email_id");
		String email = br.readLine();

		System.out.println("Enter your contact");
		int cnt = Integer.parseInt(br.readLine());

		System.out.println("------------------------");
		System.out.println("Your Details are following.");
		System.out.println("id is" + id1);
		System.out.println("Name :" + " " + Uname);
		System.out.println("Password :" + " " + pwd);
		System.out.println("Email :" + " " + email);
		System.out.println("Contact:" + " " + cnt);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("Connecting to a selected database...");
			Connection conn1 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/userdata", "root",
					"sathiesh9494");
			System.out.println("Connected database successfully...");

			System.out.println("Inserting records into the table...");
			Statement stmt1 = conn1.createStatement();

			String str = ("INSERT INTO usersdetails(id,Name,Password,Email,Contact) values ('"
					+ id1
					+ "','"
					+ Uname
					+ "','"
					+ pwd
					+ "','"
					+ email
					+ "','"
					+ cnt + "')");

			stmt1.executeUpdate(str);

			System.out.println("All Right , We got your entry");
			conn1.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("hhhh");
		}
	}

	private static void update() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter your id:");
		
		 int y = Integer.parseInt(br.readLine());
		System.out.println("Enter your UserName");
		String Uname2 = br.readLine();
		System.out.println("Welcome" + " " + Uname2);

		System.out.println("Enter your Password");
		String pwd2 = br.readLine();

		System.out.println("Enter your email_id");
		String email2 = br.readLine();

		System.out.println("Enter your contact");
		int cnt2 = Integer.parseInt(br.readLine());
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn3 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/userdata", "root",
					"sathiesh9494");
			Statement stmt3 = conn3.createStatement();
			//String query = ("UPDATE table usersdetails SET salary = 2000 where id=" + y);
			String query = ("UPDATE  usersdetails SET Name='"+Uname2+"',Password='"+pwd2+"',Email='"+email2+"',Contact='"+cnt2+"'where id="+y);

			stmt3.execute(query);
			// ResultSet rs= stmt.executeQuery(query);
			System.out.println("the value updated.....");
			conn3.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("hhhh");
		}
	}

	private static void delete() throws Exception {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the id:");
		int c = scr.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn4 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/userdata", "root",
					"sathiesh9494");
			Statement stmt4 = conn4.createStatement();
			String query = ("DELETE from userdata.usersdetails  where id=" + c);
			stmt4.execute(query);
			// ResultSet rs= stmt.executeQuery(query);
			System.out.println("the value deleted.....");
			conn4.close();
		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("hhhh");
		}
	}

	private static void list() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn5 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/userdata", "root",
					"sathiesh9494");
			Statement stmt5 = conn5.createStatement();

			ResultSet rs = stmt5
					.executeQuery("SELECT id,Name,Password,Email,Contact,Salary FROM usersdetails ");
			while (rs.next()) {
				String ids = rs.getString("id");
				String Unam = rs.getString("Name");
				String Pwds = rs.getString("Password");
				String emails = rs.getString("Email");
				String conc = rs.getString("Contact");
				String Sal = rs.getString("Salary");
				System.out.println("   " + ids + "     " + Unam + "    " + Pwds
						+ "    " + emails + "    " + conc + "    " + Sal);
			}
			conn5.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("hhhh");
		}
	}

	private static void exit() throws Exception {
		System.out.println("the program terminated......");
	}
}
