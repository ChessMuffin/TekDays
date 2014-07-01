package com.tekdays

class TekEvent {

	String city
	String name
	String organizer
	String venue
	Date startDate
	Date endDate
	String desc
	
    static constraints = {
		name()
		city()
		venue()
		desc(maxSize: 5000)
		startDate()
		endDate()
    }
	
	@Override
	String toString() {
		"${name}, ${city}"
	}
}
