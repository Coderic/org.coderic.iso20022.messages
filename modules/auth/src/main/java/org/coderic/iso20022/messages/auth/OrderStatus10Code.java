//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:22 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderStatus10Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="OrderStatus10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTI"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus10Code")
@XmlEnum
public enum OrderStatus10Code {

    ACTI,
    INAC,
    SUSP;

    public String value() {
        return name();
    }

    public static OrderStatus10Code fromValue(String v) {
        return valueOf(v);
    }

}
