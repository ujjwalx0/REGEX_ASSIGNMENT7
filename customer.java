
/*Create the following packages;
com.xyz.app1.model;
com.xyz.app1.service;
com.xyz.app1.test
Keep the Customer.java in com.xyz.app1.model; package.
Keep the CustomerService.java in com.xyz.app1.service; package
Keep the CustomerTest.java in com.xyz.app1.test; package*/


package com.xyz.app1.model;
public class customer {
private int CustomerAge;
private String CustomerName;

public customer(int CustomerAge, String CustomerName) {
super();
this.CustomerAge = CustomerAge;
this.CustomerName= CustomerName;

}
@Override
public String toString() {
return "customer [Age=" + CustomerAge + ", Cust_Name=" + CustomerName + "]";


}
}



