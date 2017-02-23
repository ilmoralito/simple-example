package issues

import grails.rest.*
import grails.converters.*

class CopyController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CopyController() {
        super(Copy)
    }
}
