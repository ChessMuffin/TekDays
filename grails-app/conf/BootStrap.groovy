import com.tekdays.TekEvent
import java.text.SimpleDateFormat

class BootStrap {

    def init = { servletContext ->
		def df = new SimpleDateFormat('yyyy-MM-dd')
		def tekEvent1 = new TekEvent(name:'Groovy One', 
									 city:'Stockholm', 
									 venue:'Stockholm Waterfront', 
								     desc:'A Groovy bonanaza for all geeks!',
									 organizer:'SGG (Stockholm Groovy Group)',
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
									 organizer: 'Oracle',
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
