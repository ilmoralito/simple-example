package issues

class Copy {
    String documentDescription
    Integer copies

    static constraints = {
        documentDescription blank: false
        copies min: 1
    }
}
