package issues

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        '/copies'(resources: 'copy')

        '/' controller: 'application', action:'index'
        '500' view: '/error'
        '404' view: '/notFound'
    }
}
