package com.UserDao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Model.User;
import com.pack.Data;

public class UserDao {

	public void register(User u) {
		// TODO Auto-generated method stub
		String username = u.getUsername();
		String password = u.getPassword();
		String email = u.getEmail();
		String fname = u.getFname();
		String lname = u.getLname();
		String sex = u.getSex();
		String address = u.getAddress();
		String createdby = u.getCreatedby();
		String updatedby = u.getUpdatedby();
		// Date d=new Date();
		String createddate = u.getCreateddate();
		String updateddate = u.getUpdateddate();
		int roleid = u.getRoleid();
		Connection conn = null;
		Data d1 = new Data();
		try {
			conn = d1.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate("insert into userdetail(Username,Password,Email,Firstname,Lastname,Sex,Address,Createdby,Updateby,Createddate,Updatedate,Role_Roleid) values('"
					+ username
					+ "','"
					+ password
					+ "','"
					+ email
					+ "','"
					+ fname
					+ "','"
					+ lname
					+ "','"
					+ sex
					+ "','"
					+ address
					+ "','"
					+ createdby
					+ "','"
					+ updatedby
					+ "','"
					+ createddate
					+ "','" + updateddate + "','" + roleid + "')");
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void update(User u) {
		// TODO Auto-generated method stub
		/*String username = u.getUsername();
		String password = u.getPassword();
		String email = u.getEmail();
		String fname = u.getFname();
		String lname = u.getLname();
		String sex = u.getSex();
		String address = u.getAddress();
		String createdby = u.getCreatedby();
		String updatedby = u.getUpdatedby();
		// Date d=new Date();
		String createddate = u.getCreateddate();
		String updateddate = u.getUpdateddate();
		int roleid = u.getRoleid();*/
		Connection conn = null;
		Data d1 = new Data();
		try
		{
			conn = d1.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			String query = "UPDATE userdetail SET Password='" + u.getPassword()
					+ "',Firstname='" + u.getFname() + "',Lastname='" + u.getLname()
					+ "',Sex='"+u.getSex()+"',Address='"+u.getAddress()+"' where Username='" + u.getUsername() + "'";
			
			stmt.executeUpdate(query);
			//System.out.println("sathiesh is update");
			conn.close();
	}catch (Exception e) {
		System.out.println(e);
	}
}

	public void delete(User u) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Data d1=new Data();
		try{
			conn = d1.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			String query = ("DELETE  from userdetails.userdetail  where Username='"
					+ u.getUsername() + "'");
			stmt.executeUpdate(query);
			conn.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public ArrayList<User> list() {
		// TODO Auto-generated method stub
		ArrayList<User> user=new ArrayList<User>();
		Connection conn=null;
		Data d1=new Data();
		try{
			conn = d1.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs=stmt.executeQuery("select Id,Username,Password,Email,Firstname,Lastname,Sex,Address,Createdby,Updateby,Createddate,Updatedate,Role_Roleid from userdetail");
			while(rs.next()){
			
		    User  u=new User();
		    u.setId(rs.getInt("Id"));
		    u.setUsername(rs.getString("Username"));
		    u.setPassword(rs.getString("Password"));
		    u.setEmail(rs.getString("Email"));
		    u.setFname(rs.getString("Firstname"));
		    u.setLname(rs.getString("Lastname"));
		    u.setSex(rs.getString("Sex"));
		    u.setAddress(rs.getString("Address"));
		    u.setCreatedby(rs.getString("Createdby"));
		    u.setUpdatedby(rs.getString("Updateby"));
		    u.setCreateddate(rs.getString("Createddate"));
		    u.setUpdateddate(rs.getString("Updatedate"));
		    u.setRoleid(rs.getInt("Role_Roleid"));
		    user.add(u);
		    System.out.println("hai");
			}conn.close();
			
	}catch (Exception e) {
		System.out.println(e);
	}
		return user;
		}

	public void adduser(User u1) {
		// TODO Auto-generated method stub
		String username = u1.getUsername();
		String password = u1.getPassword();
		String email = u1.getEmail();
		String fname = u1.getFname();
		String lname = u1.getLname();
		String sex = u1.getSex();
		String address = u1.getAddress();
		String createdby = u1.getCreatedby();
		String updatedby = u1.getUpdatedby();
		// Date d=new Date();
		String createddate = u1.getCreateddate();
		String updateddate = u1.getUpdateddate();
		int roleid = u1.getRoleid();
		Connection conn = null;
		Data d = new Data();
		try {
			conn = d.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate("insert into userdetail(Username,Password,Email,Firstname,Lastname,Sex,Address,Createdby,Updateby,Createddate,Updatedate,Role_Roleid) values('"
					+ username
					+ "','"
					+ password
					+ "','"
					+ email
					+ "','"
					+ fname
					+ "','"
					+ lname
					+ "','"
					+ sex
					+ "','"
					+ address
					+ "','"
					+ createdby
					+ "','"
					+ updatedby
					+ "','"
					+ createddate
					+ "','" + updateddate + "','" + roleid + "')");
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}}