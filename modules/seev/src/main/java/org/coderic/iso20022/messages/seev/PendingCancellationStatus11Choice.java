//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:17 PM COT 
//


package org.coderic.iso20022.messages.seev;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PendingCancellationStatus11Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PendingCancellationStatus11Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NotSpcfdRsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}NoReasonCode"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}PendingCancellationStatusReason11" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingCancellationStatus11Choice", propOrder = {
    "notSpcfdRsn",
    "rsn"
})
public class PendingCancellationStatus11Choice {

    @XmlElement(name = "NotSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode notSpcfdRsn;
    @XmlElement(name = "Rsn")
    protected List<PendingCancellationStatusReason11> rsn;

    /**
     * Obtiene el valor de la propiedad notSpcfdRsn.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNotSpcfdRsn() {
        return notSpcfdRsn;
    }

    /**
     * Define el valor de la propiedad notSpcfdRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setNotSpcfdRsn(NoReasonCode value) {
        this.notSpcfdRsn = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingCancellationStatusReason11 }
     * 
     * 
     */
    public List<PendingCancellationStatusReason11> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<PendingCancellationStatusReason11>();
        }
        return this.rsn;
    }

}
