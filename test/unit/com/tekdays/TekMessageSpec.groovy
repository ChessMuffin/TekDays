package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekMessage)
class TekMessageSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test toString"() {
		when:
		def msg = new TekMessage(subject: 'A proposal', content: '-')
		
		then:
		msg.toString() == 'A proposal'
    }
}
