import groovy.util.GroovyTestCase

class DiffTest extends GroovyTestCase {
    void testStrings() {
        assert "AA" == "AA"
        assert "AA" < "BB"
        assert "AA_BB" < "AA_BB_CC"

    }
}