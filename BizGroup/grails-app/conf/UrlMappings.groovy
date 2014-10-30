class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		"/"(controller:"HomePage")
        "/about_app"(view:"/AboutBizGroupApplication") // changed from / yg 21-10
        "500"(view:'/error')
	}
}
