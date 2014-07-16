package com.tekdays

class TekEvent {

	String city
	String name
	TekUser organizer
	String venue
	Date startDate
	Date endDate
	String desc
	
    static constraints = {
		name()
		city()
		venue()
		desc maxSize: 5000
		startDate()
		endDate()
		sponsorships nullable:true
		tasks nullable: true
    }
	
	static hasMany = [volunteers: TekUser, respondents: String, sponsorships: Sponsorship, tasks: Task]
	
	@Override
	String toString() {
		"${name}, ${city}"
	}
}
