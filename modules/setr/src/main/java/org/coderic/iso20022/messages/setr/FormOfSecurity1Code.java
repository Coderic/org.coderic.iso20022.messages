//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.11 a las 06:39:34 AM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FormOfSecurity1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FormOfSecurity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEAR"/&gt;
 *     &lt;enumeration value="REGD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FormOfSecurity1Code")
@XmlEnum
public enum FormOfSecurity1Code {

    BEAR,
    REGD;

    public String value() {
        return name();
    }

    public static FormOfSecurity1Code fromValue(String v) {
        return valueOf(v);
    }

}
