package org.dnyanyog.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

	@Component
	public class Student {
	    public String firstName = new String();
	    public Integer p;
	    public long l;
	    
	    public String lastName;
	    public String branchName;
	    public int age;
	    public String mobile;

	    @Autowired
	    private Address address;

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public Long getL() {
	        return l;
	    }

	    public void setL(Long l) {
	    	this.l=l;
	    }

	    public Integer getP()
	    {
	    	return p;
	    }
	}



