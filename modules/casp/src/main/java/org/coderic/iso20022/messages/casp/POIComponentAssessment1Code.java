//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:26 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para POIComponentAssessment1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="POIComponentAssessment1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPL"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="EVAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POIComponentAssessment1Code")
@XmlEnum
public enum POIComponentAssessment1Code {

    APPL,
    CERT,
    EVAL;

    public String value() {
        return name();
    }

    public static POIComponentAssessment1Code fromValue(String v) {
        return valueOf(v);
    }

}
