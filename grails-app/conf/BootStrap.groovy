import com.tekdays.TekEvent
import com.tekdays.TekUser
import java.text.SimpleDateFormat

class BootStrap {

    def init = { servletContext ->
		def df = new SimpleDateFormat('yyyy-MM-dd')
		new TekUser(fullName: 'Hatim Shahzada',
			userName: 'shazha',
			password: 'Summer2014',
			email: 'hatim.shahzada@assaabloy.com',
			website: 'www.assaabloy.com',
			bio: 'A lot...').save()
		new TekUser(fullName: 'Jussi Jakenberg',
				userName: 'jusjak',
				password: 'qwerty123',
				email: 'jussi.jakenberg@@assaabloy.com',
				website: 'www.assaabloy.com',
				bio: 'A lot...').save()
		def tekEvent1 = new TekEvent(name:'Groovy One', 
									 city:'Stockholm', 
									 venue:'Stockholm Waterfront', 
								     desc:'A Groovy bonanaza for all geeks!',
									 organizer:TekUser.findByFullName('Hatim Shahzada'),
									 startDate: df.parse('2014-07-14'),
									 endDate: df.parse('2014-07-18'))
		if(!tekEvent1.save()) {
			println "Error saving tekEvent1"
			tekEvent1.errors.allErrors.each {println "${it}"}
		}
		def tekEvent2 = new TekEvent(name:'Java One',
									 city:'San Fransisco',
									 venue:'Hilton San Francisco Union Square',
									 desc:'The one',
									 organizer: TekUser.findByFullName('Jussi Jakenberg'),
									 startDate: df.parse('2014-09-28'),
									 endDate: df.parse('2014-10-02'))
		if(!tekEvent2.save()) {
			println "Error saving tekEvent2"
			tekEvent2.errors.allErrors.each {println "${it}"}
		}
	}
	
    def destroy = {
    }
}
