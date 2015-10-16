package com.pack.bluemaple.app.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.pack.bluemaple.app.model.model;
import com.pack.bluemaple.app.service.Service;

//import com.pack.bluemaple.app.userdao.UserDao;

public class menu {
	public static void main(String args[]) throws Exception

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1.SIGNUP:");
			System.out.println("2.SIGN IN:");
			System.out.println("3.LISTUSER:");
			System.out.println("4.EXIT:");
			System.out.println("Enter the value:");
			int i = Integer.parseInt(br.readLine());

			switch (i) {
			case 1: {
				do {

					// System.out.println("enter your userId");
					// int id1 = Integer.parseInt(br.readLine());

					System.out.println("Enter your userName");
					String Uname = br.readLine();

					System.out.println("Enter your password");
					String pwd = br.readLine();

					System.out.println("Enter your email");
					String mail = br.readLine();

					System.out.println("Enter your contact");
					String cnt = br.readLine();

					System.out.println("------------------------");
					System.out.println("Your Details are following.");
					// System.out.println("userId is" + id1);
					System.out.println("userName :" + " " + Uname);
					System.out.println("password :" + " " + pwd);
					System.out.println("email :" + " " + mail);
					System.out.println("contact:" + " " + cnt);

					model m = new model();
					m.setUserName(Uname);
					m.setPassword(pwd);
					m.setEmail(mail);
					m.setContact(cnt);
					Service s = new Service();
					s.activity(m);

					System.out.println("do you continue:y/n");
					String s10 = br.readLine();
					if (s10.startsWith("n")) {
						break;
					}
				} while (true);

				break;
			}

			case 2: {
				do {
					int a = 1;
					// String name =null;
					// String password = null;
					System.out.println("Enter your userName");
					String uname = br.readLine();

					System.out.println("Enter your password");
					String pword = br.readLine();
					Service s1 = new Service();
					ArrayList<model> user = (ArrayList<model>) s1.activity1();

					for (int j = 0; j < user.size(); j++) {
						if (uname.equals(user.get(j).getUserName())
								&& pword.equals(user.get(j).getPassword())) {
							System.out.println("sucess");
							a = a + 1;
							if (a == 2) {

								System.out.println("1.UPDATE:");
								System.out.println("2.DELETE:");
								System.out.println("3.LOGOUT:");

								int i2 = Integer.parseInt(br.readLine());
								switch (i2) {
								case 1: {

									System.out.println("enter the  userId");
									int f = Integer.parseInt(br.readLine());
									// System.out.println("enter the userId");
									// int u = Integer.parseInt(br.readLine());
									// System.out.println("enter the user userName");
									// String n = br.readLine();
									System.out
											.println("enter the user password");
									String p = br.readLine();
									System.out.println("enter the user email");
									String e = br.readLine();
									System.out
											.println("enter the user contact");
									String t = br.readLine();

									model m = new model();
									m.setUserId(f);
									m.setUserName(uname);
									m.setPassword(p);
									m.setEmail(e);
									m.setContact(t);
									Service s = new Service();
									s.activity2(m);
									break;
								}
								case 2: {
									// System.out.println("enter the  userId");
									// int f = Integer.parseInt(br.readLine());
									model m = new model();
									m.setUserName(uname);
									Service s = new Service();
									s.activity3(m);
									break;
								}
								case 3: {
									System.out.println("Logout Sucessfully");
									break;

								}

								}
							}
						}

					}
					if (a == 1) {

						System.out.println("login failed");
					}

					System.out.println("select ur option:y/n");
					String s10 = br.readLine();
					if (s10.startsWith("n")) {
						break;
					}
				} while (true);

				break;
			}

			case 3: {
				System.out.println("the list of the table is:...");

				Service s1 = new Service();

				List<model> user = s1.activity1();
				for (int k = 0; k <= user.size(); k++) {
					System.out.println("the list: " + user.get(k).toString());
					System.out.println(k);
				}
				break;
			}
			case 4: {
				System.out.println("the program terminated........");
				break;
			}
			}

			System.out.println("do you continue to main menu:y/n");
			String s10 = br.readLine();
			if (s10.startsWith("n")) {
				break;
			}
		} while (true);

	}

}
