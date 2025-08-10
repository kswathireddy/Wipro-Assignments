package com.spring;


public class Customer {

	    private String name;
	    
	    

	    public String getName() {
			return name;
		}


		public void setName(String name) {
	        this.name = name;
	    }

	    
	    public void showDetails() {
	        System.out.println("Customer Name: " + name);
	        
	    }
	}



