//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.11 a las 06:39:33 AM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SafekeepingPlace1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="SafekeepingPlace1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="ICSD"/&gt;
 *     &lt;enumeration value="NCSD"/&gt;
 *     &lt;enumeration value="SHHE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SafekeepingPlace1Code")
@XmlEnum
public enum SafekeepingPlace1Code {

    CUST,
    ICSD,
    NCSD,
    SHHE;

    public String value() {
        return name();
    }

    public static SafekeepingPlace1Code fromValue(String v) {
        return valueOf(v);
    }

}
