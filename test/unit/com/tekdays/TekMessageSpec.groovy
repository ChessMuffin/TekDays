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

    void "test toString"() {
		when :"a TekMessage has a subject"
		def msg = new TekMessage(subject: 'A proposal', content: '-')
		then :"the toString method will show the subject"
		msg.toString() == 'A proposal'
    }
}
