package org.bbop.apollo

import groovy.transform.EqualsAndHashCode
@EqualsAndHashCode
class OrganismProperty {

    static constraints = {
    }

    String key
    String value
    Organism organism

    static mapping = {
        value type: 'text'
    }
}
