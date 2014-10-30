package com.bizgroup

class SupplierController {
	static scaffold = true
    // def index() { }
	static constraints  = {
		externalID()
		name()
		Description()
		status()		
		
	}
	
}
