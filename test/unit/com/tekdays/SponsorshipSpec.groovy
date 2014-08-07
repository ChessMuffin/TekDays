package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Sponsorship)
class SponsorshipSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test toString"() {
		when:
		def sponsor = new Sponsor(name: 'Coca Cola')
		def sponsorShip = new Sponsorship(sponsor: sponsor, contributionType: 'Other')
		
		then:
		sponsorShip.toString() == "Coca Cola, Other"
    }
}
