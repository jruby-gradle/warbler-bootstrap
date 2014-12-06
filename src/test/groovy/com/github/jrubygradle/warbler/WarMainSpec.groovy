package com.github.jrubygradle.warbler

import spock.lang.Specification

class WarMainSpec extends Specification {

    def "basic instantiation"() {
        when:
        def wm = new WarMain()

        then:
        wm instanceof WarMain
    }
}
