//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.11 a las 06:39:17 AM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMSContactLevel1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TMSContactLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRIT"/&gt;
 *     &lt;enumeration value="ASAP"/&gt;
 *     &lt;enumeration value="DTIM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TMSContactLevel1Code")
@XmlEnum
public enum TMSContactLevel1Code {

    CRIT,
    ASAP,
    DTIM;

    public String value() {
        return name();
    }

    public static TMSContactLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
