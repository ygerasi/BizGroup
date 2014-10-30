package com.bizgroup

class MemberPurchase implements Serializable {
	// Long memberInternalId - not needed the link is in the class definition 'Member member'
	Integer year
	Long supplierInternalId
	Double memberReportedPurchases
	Double memberReportedRebates
	Double supplierReportedPurchases
	Double supplierReportedRebates
	//Member member
	
	static belongsTo = [member:Member]
	/*
	static mapping = {
		id composite: ['memberInternalId', 'year','supplierInternalId']
		
	}*/

    static constraints = {
		year blank: false
    }
}
