package com.bizgroup

class HomePageController {
	static defaultAction = 'index'
    def index() {
		
		[top5Suppliers:Supplier.list(max:5, sort:"dateJoined", order:"desc"),
		 top5SupplierDeals:SupplierDeal.list(max:5, sort:"dealStartDate", order:"desc")]   // the list is build-in GORM
		
		
		
	}
	def showTime () {
		render "The time is ${new Date()}"
	}
	def One() {
		log.info('In the One action...')
		render 'Welcome to BizGroups One!'
		
	}	
	def search(String q) {
	//def search() {
		render 'seach results:' +   q
		// search plugin does not work with hibernate 4.0
		// tbd find another search engine ?
		/*	def searchResults = [:]
			if(q) {
				searchResults.supplierResults = trySearch { Supplier.search("*${q}*", [max: 10]) }
				searchResults.supplierDealResults = trySearch { SupplierDeal.search("*${q}*", [max: 10]) }
				//searchResults.songResults = trySearch { Song.search("*${q}*", [max: 10]) }
			}
			render template: 'searchResults', model: searchResults
		}
	
		private trySearch(Closure callable) {
			try {
				return callable()
			} catch (Exception e) {
				log.debug "Search Error: ${e.message}", e
				return []
			}*/
			
			/*
			 * 
			 * One interesting aspect of this code is the trySearch method, which demonstrates a compelling use of Groovy closures to deal with exceptions. Since an exception will likely be the result of an error in the search syntax, it is preferable to log that error and return an empty result than throw the error back to the user.
			 */
	}
}
