package com.bizgroup
import java.util.Date;

import grails.validation.Validateable

@Validateable

abstract class Person implements Serializable {
	String firstName
	String lastName
	String jobTitle
	String eMail
	Date lastUpdated
	Date dateCreated
	
	static mapping = {
		autoTimestamp true
	}
	
	static constraints = {
		firstName blank:false
		lastName blank:false
		jobTitle blank:false
		eMail email :true
	}
}
