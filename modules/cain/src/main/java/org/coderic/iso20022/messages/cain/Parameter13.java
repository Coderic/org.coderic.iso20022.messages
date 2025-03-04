//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:05 PM COT 
//


package org.coderic.iso20022.messages.cain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Parameter13 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Parameter13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Algorithm20Code" minOccurs="0"/&gt;
 *         &lt;element name="MskGnrtrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}AlgorithmIdentification26" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter13", propOrder = {
    "dgstAlgo",
    "mskGnrtrAlgo"
})
public class Parameter13 {

    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected Algorithm20Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo")
    protected AlgorithmIdentification26 mskGnrtrAlgo;

    /**
     * Obtiene el valor de la propiedad dgstAlgo.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm20Code }
     *     
     */
    public Algorithm20Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Define el valor de la propiedad dgstAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm20Code }
     *     
     */
    public void setDgstAlgo(Algorithm20Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad mskGnrtrAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification26 }
     *     
     */
    public AlgorithmIdentification26 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Define el valor de la propiedad mskGnrtrAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification26 }
     *     
     */
    public void setMskGnrtrAlgo(AlgorithmIdentification26 value) {
        this.mskGnrtrAlgo = value;
    }

}
