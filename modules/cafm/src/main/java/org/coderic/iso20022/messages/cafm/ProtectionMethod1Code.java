//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:50 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProtectionMethod1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ProtectionMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SELM"/&gt;
 *     &lt;enumeration value="SNCL"/&gt;
 *     &lt;enumeration value="SOFT"/&gt;
 *     &lt;enumeration value="TEEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProtectionMethod1Code")
@XmlEnum
public enum ProtectionMethod1Code {

    OTHN,
    OTHP,
    SELM,
    SNCL,
    SOFT,
    TEEN;

    public String value() {
        return name();
    }

    public static ProtectionMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
