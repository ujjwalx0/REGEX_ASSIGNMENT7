package com.xyz.app1.service;
import com.xyz.app1.model.*;

public class Customer_Service {
private customer[] customers = new customer[4];
public Customer_Service() {
customers = new customer[] { 
new customer(34, "rakesh"), 
new customer(22, "amish"),
new customer(31, "suresh"), 
new customer(42, "mukesh"), 
};
}
public customer[] getCustomers() {
return customers;
}
}
