//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:26 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para POIComponentType6Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="POIComponentType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AQPP"/&gt;
 *     &lt;enumeration value="APPR"/&gt;
 *     &lt;enumeration value="TLPR"/&gt;
 *     &lt;enumeration value="SCPR"/&gt;
 *     &lt;enumeration value="SERV"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="DVCE"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="APLI"/&gt;
 *     &lt;enumeration value="EMVK"/&gt;
 *     &lt;enumeration value="EMVO"/&gt;
 *     &lt;enumeration value="MDWR"/&gt;
 *     &lt;enumeration value="DRVR"/&gt;
 *     &lt;enumeration value="OPST"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *     &lt;enumeration value="CRTF"/&gt;
 *     &lt;enumeration value="TMSP"/&gt;
 *     &lt;enumeration value="SACP"/&gt;
 *     &lt;enumeration value="SAPR"/&gt;
 *     &lt;enumeration value="LOGF"/&gt;
 *     &lt;enumeration value="MDFL"/&gt;
 *     &lt;enumeration value="SOFT"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="RPFL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POIComponentType6Code")
@XmlEnum
public enum POIComponentType6Code {

    AQPP,
    APPR,
    TLPR,
    SCPR,
    SERV,
    TERM,
    DVCE,
    SECM,
    APLI,
    EMVK,
    EMVO,
    MDWR,
    DRVR,
    OPST,
    MRPR,
    CRTF,
    TMSP,
    SACP,
    SAPR,
    LOGF,
    MDFL,
    SOFT,
    CONF,
    RPFL;

    public String value() {
        return name();
    }

    public static POIComponentType6Code fromValue(String v) {
        return valueOf(v);
    }

}
