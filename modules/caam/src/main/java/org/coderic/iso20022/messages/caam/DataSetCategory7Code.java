//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:40 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataSetCategory7Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="DataSetCategory7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATMC"/&gt;
 *     &lt;enumeration value="ATMP"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="CRAP"/&gt;
 *     &lt;enumeration value="CPRC"/&gt;
 *     &lt;enumeration value="OEXR"/&gt;
 *     &lt;enumeration value="AMNT"/&gt;
 *     &lt;enumeration value="LOCC"/&gt;
 *     &lt;enumeration value="MNOC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataSetCategory7Code")
@XmlEnum
public enum DataSetCategory7Code {

    ATMC,
    ATMP,
    APPR,
    CRAP,
    CPRC,
    OEXR,
    AMNT,
    LOCC,
    MNOC;

    public String value() {
        return name();
    }

    public static DataSetCategory7Code fromValue(String v) {
        return valueOf(v);
    }

}
