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
 * <p>Clase Java para OrderStatus11Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="OrderStatus11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIRM"/&gt;
 *     &lt;enumeration value="IMPL"/&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *     &lt;enumeration value="ROUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus11Code")
@XmlEnum
public enum OrderStatus11Code {

    FIRM,
    IMPL,
    INDI,
    ROUT;

    public String value() {
        return name();
    }

    public static OrderStatus11Code fromValue(String v) {
        return valueOf(v);
    }

}
