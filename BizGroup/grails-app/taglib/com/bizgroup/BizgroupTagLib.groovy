package com.bizgroup

class BizgroupTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	static namespace = 'gt'
	
		def repeat = { attrs, body ->
			// retrieve the 'times' attribute and convert it to an int
			int n = attrs.int('times')
	
			// render the body n times, passing a 1 based
			// counter into the body each time
			n.times { counter ->
				out << body(counter + 1)
			}
		}
}
