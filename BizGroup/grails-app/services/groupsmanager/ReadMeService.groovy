package groupsmanager

import grails.transaction.Transactional

@Transactional
class ReadMeService {

    def serviceMethod() {

    }
}


/*
A common pattern in the development of enterprise software is the so-called service layer that encapsulates a set of business operations. With Java web development, it is generally considered good practice to provide layers of abstraction and reduce coupling between the layers within an MVC application.
The service layer provides a way to centralize application behavior into an API that can be utilized by controllers or other services. Many good reasons exist for encapsulating logic into a service layer, 

but the following are the main drivers:
* You need to centralize business logic into a service API.
* The use cases within your application operate on multiple domain objects and model complex business operations that are best not mixed in with controller logic.
* Certain use cases and business processes are best encapsulated outside a domain object and within an API.

*/