//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:44 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlgorithmIdentification11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmIdentification11"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Algorithm7Code"/&gt;
 *         &lt;element name="Param" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Parameter4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmIdentification11", propOrder = {
    "algo",
    "param"
})
public class AlgorithmIdentification11 {

    @XmlElement(name = "Algo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm7Code algo;
    @XmlElement(name = "Param")
    protected Parameter4 param;

    /**
     * Obtiene el valor de la propiedad algo.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm7Code }
     *     
     */
    public Algorithm7Code getAlgo() {
        return algo;
    }

    /**
     * Define el valor de la propiedad algo.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm7Code }
     *     
     */
    public void setAlgo(Algorithm7Code value) {
        this.algo = value;
    }

    /**
     * Obtiene el valor de la propiedad param.
     * 
     * @return
     *     possible object is
     *     {@link Parameter4 }
     *     
     */
    public Parameter4 getParam() {
        return param;
    }

    /**
     * Define el valor de la propiedad param.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter4 }
     *     
     */
    public void setParam(Parameter4 value) {
        this.param = value;
    }

}
