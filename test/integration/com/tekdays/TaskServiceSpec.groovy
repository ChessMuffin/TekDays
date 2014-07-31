package com.tekdays


import grails.test.mixin.*;
import spock.lang.*

/**
 *
 */
@TestFor(TaskService)
class TaskServiceSpec extends Specification {
	
	def taskService

    def setup() {
		new TekUser(fullName: 'Tammy Tester',  email: 'tester@test.com', website: 'http://www.test.com', bio: 'A test person').save()
    }

    def cleanup() {
    }

    void "test addDefaultTasks"() {
		when: "we pass a TekEvent to addDefaultTasks"
		TekEvent tekEvent = new TekEvent(name: 'Test event', city: 'Test city', description: 'Test description', 
			organizer: TekUser.findByUserName('tester') ,startDate: new Date(), endDate: new Date() + 1)
		taskService.addDefaultTasks(tekEvent)		
		then: "default tasks are added"
		tekEvent.tasks.size() > 0
    }
}
