package com.bizgroup

class Member {

	//Long InternalId - no need Grails adds it autmaticcaly
	//
	Long internalGroupId
	String externalID
	String name
	double annualSales
	double annualGrossMargin
	Date dateFounded
	Date dateJoined
	Date dateResigned
    String status
	Date lastUpdated// Using convention, if you define a property called lastUpdated and a property called dateCreated in your domain class, GORM will automatically update these two properties for you anytime you perform an insert or an update. 
	Date dateCreated
	
	/*static mapping = {
		id name: 'InternalId'
		}*/
	
	
	static hasMany = [memberPurchases: MemberPurchase,memberContacts : MemberContact]
	
	static mapping = {
		memberPurchases cascade: 'delete'
		memberContacts cascade: 'delete'
	}
	
    static constraints = {
        name blank: false
		annualSales (scale:2)
		annualGrossMargin (scale:2)
    }
}
