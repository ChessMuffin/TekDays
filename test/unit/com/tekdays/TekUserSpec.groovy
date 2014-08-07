package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekUser)
class TekUserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test toString"() {
		when:
		def tekUser = new TekUser(fullName: 'Hatim Shahzada')
		
		then:
		tekUser.toString() == 'Hatim Shahzada'
    }
}
