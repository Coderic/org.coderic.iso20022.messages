//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:34 PM COT 
//


package org.coderic.iso20022.messages.casr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Response6Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Response6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNPR"/&gt;
 *     &lt;enumeration value="PPRC"/&gt;
 *     &lt;enumeration value="PRCS"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="TECH"/&gt;
 *     &lt;enumeration value="UNRV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Response6Code")
@XmlEnum
public enum Response6Code {

    UNPR,
    PPRC,
    PRCS,
    REJT,
    OTHP,
    OTHN,
    TECH,
    UNRV;

    public String value() {
        return name();
    }

    public static Response6Code fromValue(String v) {
        return valueOf(v);
    }

}
