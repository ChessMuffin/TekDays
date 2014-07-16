package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(SponsorshipController)
class SponsorshipControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
		when: "a Sponsorship has a sponsor"
		def theSponsor = new Sponsor(name: 'Coca Cola')
		def sponsorship = new Sponsorship(sponsor: theSponsor, contributionType: 'Cash')
		then: "the toString method will show the sponsor"
		sponsorship.toString() == 'Coca Cola, Cash'
    }
}
