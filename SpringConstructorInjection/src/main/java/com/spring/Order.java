package com.spring;

public class Order {

	    
	    private Customer customer;
	    

	    

	    public Customer getCustomer() {
			return customer;
		}




		public void setCustomer(Customer customer) {
			this.customer = customer;
		}




		public void displayOrder() {
	        System.out.println("customer is:"+getCustomer().getName());
	        customer.showDetails();
	    }
	}



