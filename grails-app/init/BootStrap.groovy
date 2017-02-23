import issues.*

class BootStrap {

    def init = { servletContext ->
        new Copy(documentDescription: 'document1', copies: 5).save failOnError: true
        new Copy(documentDescription: 'document2', copies: 6).save failOnError: true
        new ExtraCopy(documentDescription: 'document3', copies: 10, description: 'Some description').save failOnError: true
    }
    def destroy = {
    }
}
