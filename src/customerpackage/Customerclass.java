package customerpackage;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Customerclass {
	
	public static List<Customer> listofcustomers() throws IOException{
		File file=new File("D:\\customerfile\\customer.txt");
		FileReader fr=new FileReader(file);
		BufferedReader bf=new BufferedReader(fr);
		List<Customer> list=new ArrayList();
		String data;
		while((data=bf.readLine())!=null) {
		String str[]=data.split(",");
		Customer c=new Customer();
		c.setCustid(Integer.parseInt(str[0]));
		c.setCustname(str[1]);
		c.setEmail(str[2]);
		c.setMobile(str[3]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String date=str[4];
		Date d = null;
		try {
		d = sdf.parse(date);
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		c.setDob(d);
		Address a=new Address();
		a.setCity(str[5]);
		a.setState(str[6]);
		a.setCountry(str[7]);
		c.setAddress(a);
		list.add(c);
		}
		return list;

		}
	
			public static void displayCustomer() throws IOException {
		
		List <Customer> list = listofcustomers();
			
			for(Customer c : list){
				System.out.println(c);
			}
		}
	
	public static int calculateage(Date dob) throws IOException {
		int age=2020-(dob.getYear()+1900);
		return age;
		}
		public static void displaybyage(int age) throws IOException{
		List<Customer> list=listofcustomers();
		List<Customer> ll=new ArrayList();
		for(Customer cus:list) {
		int age1=calculateage(cus.getDob());
		if(age1<age) {
		ll.add(cus);
		}

		}

		for(Customer c:ll) {
		System.out.println(c);
		}

		}
	public static void main(String[] args) throws IOException {
		
		Customerclass cus = new Customerclass();
		Scanner sc = new Scanner(System.in);
		while(true){
			
			System.out.println("Select \n 1.display all customers \n 2.display by age\n 3.display by country \n 4.exit");
			
			System.out.println("enter option");
			
			int option = sc.nextInt();
			
			if(option == 1){				
				displayCustomer();
				
			}			
			if(option == 2){
				System.out.println("Enter age");
				int age=Integer.parseInt(sc.next());
				displaybyage(age);
			}
			if(option == 3){
				System.out.println("enter age");				
				String city = sc.next();
			}
			if(option ==4){
				System.out.println("exited");
				System.exit(0);
			}		
		}
	}

}
