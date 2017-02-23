package issues

class ExtraCopy extends Copy {
    String description

    static constraints = {
        description blank: false
    }

    static mapping = {
        description type: 'text'
    }
}
