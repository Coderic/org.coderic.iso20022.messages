//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:45 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Context16 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Context16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxCntxt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TransactionContext8" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context16", propOrder = {
    "txCntxt"
})
public class Context16 {

    @XmlElement(name = "TxCntxt")
    protected TransactionContext8 txCntxt;

    /**
     * Obtiene el valor de la propiedad txCntxt.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext8 }
     *     
     */
    public TransactionContext8 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Define el valor de la propiedad txCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext8 }
     *     
     */
    public void setTxCntxt(TransactionContext8 value) {
        this.txCntxt = value;
    }

}
