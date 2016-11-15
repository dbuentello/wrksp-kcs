Anypoint ServiceNow Connector Demo
==================================


INTRODUCTION
------------
The ServiceNow demo consists of the following projects:

* example-servicenow-demo-dfl - Provides sample flows on how to make use of various operations supported by the connector using the new datamapper (Data Framework Language). Most of the flows are developed based on the combination of related operations to make a logical outcome.

HOW TO RUN DEMO
---------------

### Prerequisites
In order to build and run this project, you'll need;

* Anypoint Studio with Mule ESB 3.7 Runtime.
* Anypoint ServiceNow v5.0.0
* Credentials for a ServiceNow instance

### Test the flows

With Anypoint Studio up and running, open the Import wizard from the File menu. A pop-up wizard will offer you the chance to pick Anypoint Studio Project from External Location. On the next wizard window point Project Root to the location of the demo project and select the Server Runtime as Mule Server 3.7.0 CE or EE. Once successfully imported the studio will automatically present the Anypoint Flows.

From the Package Explorer view, expand the demo project and open the mule-app.properties file. Fill in the credentials of ServiceNow instance.

#### servicenow-operations-demo :

* Run the demo project.
* In web browser visit http://localhost:8081/incidentdfl to view the demo page. The page displays the operations along with respective variables required to invoke the operation defined by the flows.

While the demo project is up and running you can also directly visit the below URL's to view the output of individual flows.

* Insert into Incident table : http://localhost:8081/incidentdfl/insert?category=Software&description=TESTQAWSDL
* Get Keys from Incident table : http://localhost:8081/incidentdfl/getkeys?description=TESTQAWSDL
* Get Records from Incident table : http://localhost:8081/incidentdfl/getrecords?description=TESTQAWSDL
* Delete Multiple from Incident table : http://localhost:8081/incidentdfl/deletemultiple?description=TESTQAWSDL
* Update Incident to Incident table - http://localhost:8081/incidentdfl/update?category=Software&description=TESTQAWSDL&updatedesc=UpdatedTESTQAWSDL

SUMMARY
-------

Congratulations! The demo presents only a limited list of operations to play with, refer to the connector user manual for all the operations supported and further possibilities.