package com.xyz.app1.test;
import  com.xyz.app1.model.*;
import com.xyz.app1.service.*;
public class CustomerTest {
	
	public static void main(String[] args) {
		Customer_Service cs= new Customer_Service();
		customer[] customers = cs.getCustomers();
			for (customer cstmrs:customers)	{
				System.out.println(cstmrs);
			}
	}

}
