package com.bizgroup

class MemberContact extends Person{
	String Login  // link to UserName. can be empty
	String Phone
	static belongsTo = [members: Member]
	
}
