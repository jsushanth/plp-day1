package com.cg.oicr.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.oicr.service.ServiceImpl;

public class InsuranceClaimMain {
	static int key;
	static String username = new String();
	public static void main(String[] args) throws SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		// First Screen
		System.out.println(" User Login");
		System.out.println("____________________");
		System.out.println("Login Id :");
		int loginid = sc.nextInt();
		System.out.println("Password :");
		String password= sc.next();
		ServiceImpl service=new ServiceImpl();
		service.Login(username,password);
		System.out.println("\n");
		System.out.println("____________________");
		System.out.println("1.Insured");
		System.out.println("2.Claim Handler");
		System.out.println("3.Claim Adjuster");
		System.out.println("\n");
		System.out.println("Enter your option");
		int option;
		option = sc.nextInt();

		// second scrn
		switch (option) {
		case 1:
			System.out.println("\t1. Claim Creation");
			System.out.println("\t2. View Claim ");
			System.out.println("Enter your option");
			key = sc.nextInt();
			switch (key) {
			
			case 1:
				System.out.println("claim reason:");
				String claimreason=sc.next();
				System.out.println("Accident Location:");
				String accidentlocation=sc.next();
				System.out.println("Accident City:");
				String accidentcity=sc.next();
				System.out.println("Accident State:");
				String accidentstate=sc.next();
				System.out.println("Accident Zip:");
				int accidentzip=sc.nextInt();
				
				break;
			case 2:
				System.out.println("Display View Claim page");
				break;
			
			default:
				System.out.println("Enter Value Between 1-2");
				break;
			}

			break;
		case 2:
			System.out.println("\t1. Claim Creation");
			System.out.println("\t2.View Claim ");
			System.out.println("Enter your option");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("claim reason:");
				String claimreason=sc.next();
				System.out.println("Accident Location:");
				String accidentlocation=sc.next();
				System.out.println("Accident City:");
				String accidentcity=sc.next();
				System.out.println("Accident State:");
				String accidentstate=sc.next();
				System.out.println("Accident Zip:");
				int accidentzip=sc.nextInt();
				break;
			case 2:
				System.out.println("Display View Claim page");
				break;
			default:
				System.out.println("Enter Value Between 1-2");
				break;
			}
			break;
		case 3:
			System.out.println("\t1. New Profile Creation");
			System.out.println("\t2. Claim Creation");
			System.out.println("\t3. View Claim ");
			System.out.println("\t4. New Report Generation");
			System.out.println("Enter your option");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("1.UserName");
				String username=sc.next();
				System.out.println("2.Password");
				String pwd=sc.next();
				System.out.println("3.rolecode");
				int rolecode=sc.nextInt();
				break;
			case 2:
				System.out.println("claim reason:");
				String claimreason=sc.next();
				System.out.println("Accident Location:");
				String accidentlocation=sc.next();
				System.out.println("Accident City:");
				String accidentcity=sc.next();
				System.out.println("Accident State:");
				String accidentstate=sc.next();
				System.out.println("Accident Zip:");
				int accidentzip=sc.nextInt();
				break;
			case 3:
				System.out.println("Display View Claim page");
				break;
			case 4:
				System.out.println("Policy No:");
				int policyno=sc.nextInt();
				System.out.println("Claim No:");
				String claimno=sc.next();
				System.out.println("Claim Type:");
				String claimtype=sc.next();
				break;
			default:
				System.out.println("Enter Value Between 1-4");
				break;
			}
			break;
		default:
			System.out.println("Enter Value Between 1-4");
			break;
		}

		// Profile creation Scrn

		System.out.println("User Creation ");
		System.out.println("=================\n");
		System.out.println("Enter User Name");
		sc.next();
		System.out.println("Enter  Password");
		sc.next();
		System.out.println("Enter Role Code");
		sc.next();


	}

		
	}

