//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:35 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContentType2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ContentType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DATA"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *     &lt;enumeration value="EVLP"/&gt;
 *     &lt;enumeration value="DGST"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentType2Code")
@XmlEnum
public enum ContentType2Code {

    DATA,
    SIGN,
    EVLP,
    DGST,
    AUTH;

    public String value() {
        return name();
    }

    public static ContentType2Code fromValue(String v) {
        return valueOf(v);
    }

}
