//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:30 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GovernanceIdentification1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="GovernanceIdentification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISPR"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="UCPR"/&gt;
 *     &lt;enumeration value="URDG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GovernanceIdentification1Code")
@XmlEnum
public enum GovernanceIdentification1Code {

    ISPR,
    NONE,
    UCPR,
    URDG;

    public String value() {
        return name();
    }

    public static GovernanceIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
