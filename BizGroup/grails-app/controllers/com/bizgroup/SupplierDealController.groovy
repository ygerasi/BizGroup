package com.bizgroup

class SupplierDealController {
	static scaffold = true
	// def index() { }
	
	def display() {
		def supplierDeal = SupplierDeal.get(params.id)
		if(supplierDeal) {
			def supplier = supplierDeal.supplier
			render template: 'supplierDeal', model: [supplierDeal: supplierDeal, supplier: supplier]
		} else {
			render 'Deal not found.'
		}
	}
}
