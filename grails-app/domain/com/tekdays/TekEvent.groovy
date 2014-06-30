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
    }
	
	@Override
	String toString() {
		"${name}, ${city}"
	}
}
