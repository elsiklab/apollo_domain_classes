package org.bbop.apollo
import groovy.transform.EqualsAndHashCode
@EqualsAndHashCode
class FeaturePhenotype {
 
    static constraints = {
    }
 
    Phenotype phenotype;
    Feature feature;
}