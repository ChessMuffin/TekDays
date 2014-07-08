package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Sponsor)
class SponsorSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
		when: "a Sponsor has a name"
		def sponsor = new Sponsor(name:'The Sopranos')
		then: "the toString method will show the name"
		sponsor.toString() == 'The Sopranos'
    }
}