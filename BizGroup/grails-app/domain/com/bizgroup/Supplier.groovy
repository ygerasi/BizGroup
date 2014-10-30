package com.bizgroup

import java.io.Serializable;
import java.util.Date;

class Supplier implements Serializable {
	//static searchable = [only: ['description']]
	
	String externalID
	String name
	String desciption
	String comment
	double annualSales
	Date dateFounded
	Date dateJoined
	Date dateResigned
	String status
	Date lastUpdated// Using convention, if you define a property called lastUpdated and a property called dateCreated in your domain class, GORM will automatically update these two properties for you anytime you perform an insert or an update.
	Date dateCreated
	
	static hasMany = [supplierDeals: SupplierDeal,supplierContacts : SupplierContact]

	
	static mapping = {
		autoTimestamp true
	}
	
	
	static constraints = {
		name blank: false
		annualSales (scale:2)
	}
}
