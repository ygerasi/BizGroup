package com.bizgroup

class SupplierContact extends Person{
	String Area
	static belongsTo = [supplier: Supplier]
    static constraints = {
    }
}
