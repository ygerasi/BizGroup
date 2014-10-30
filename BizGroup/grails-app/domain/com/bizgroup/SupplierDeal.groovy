package com.bizgroup
import java.util.Date;

class SupplierDeal {
	//static searchable = [only: ['description']]
	
	Date dealStartDate
	Date dealEndDate
	Date showStartDate
	Date showEndDate
	String description
	// tbd store image
	Integer rank // rank /order of the deal
	Date lastUpdated
	Date dateCreated
	
	static mapping = {
		autoTimestamp true
	}

	static belongsTo = [supplier: Supplier]
    static constraints = {
    }
	/*def save() {
		SupplierDeal.withTransaction { status ->
			def SupplierDeal = SupplierDeal.get(params.id)
			SupplierDeal.title = "Changed Title"
			SupplierDeal.save(flush:true)
			def savepoint = status.createSavepoint()
			...
			// something goes wrong
			if(hasSomethingGoneWrong()) {
				status.rollbackToSavepoint(savepoint)
				// do something else
				...
			}
		}
	}*/
	def onLoad() {
		//new AuditLogEvent(type:"read", data:title).save()
	}
	def beforeSave() {
		//new AuditLogEvent(type:"save", data:title).save()
	}

	def beforeValidate() {
		// run before validation happens
	}

	def beforeValidate(List propertiesBeingValidated) {
		// run before validation happens and propertiesBeingValidated
		// is a List containing the names of all of the properties which
		// are about to be validated.
	}
	
}
