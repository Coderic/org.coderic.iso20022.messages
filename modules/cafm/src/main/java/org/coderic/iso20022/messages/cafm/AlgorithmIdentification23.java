//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:50 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlgorithmIdentification23 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmIdentification23"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Algorithm18Code"/&gt;
 *         &lt;element name="Param" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Parameter12" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmIdentification23", propOrder = {
    "algo",
    "param"
})
public class AlgorithmIdentification23 {

    @XmlElement(name = "Algo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm18Code algo;
    @XmlElement(name = "Param")
    protected Parameter12 param;

    /**
     * Obtiene el valor de la propiedad algo.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm18Code }
     *     
     */
    public Algorithm18Code getAlgo() {
        return algo;
    }

    /**
     * Define el valor de la propiedad algo.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm18Code }
     *     
     */
    public void setAlgo(Algorithm18Code value) {
        this.algo = value;
    }

    /**
     * Obtiene el valor de la propiedad param.
     * 
     * @return
     *     possible object is
     *     {@link Parameter12 }
     *     
     */
    public Parameter12 getParam() {
        return param;
    }

    /**
     * Define el valor de la propiedad param.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameter12 }
     *     
     */
    public void setParam(Parameter12 value) {
        this.param = value;
    }

}
