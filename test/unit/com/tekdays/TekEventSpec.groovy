package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class TekEventSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }
	
	void "test toString"() {
		when: 
		def tekEvent = new TekEvent(name:'Groovy One', city: 'Stockholm', organizer: 'Hatim Shahzada')
		
		then:
		tekEvent.toString() == 'Groovy One, Stockholm'
	}
}
