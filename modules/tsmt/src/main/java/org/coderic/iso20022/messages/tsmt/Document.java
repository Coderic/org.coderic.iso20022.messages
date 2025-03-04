//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:35 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtyEvtAdvc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}PartyEventAdviceV01"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyEvtAdvc"
})
public class Document {

    @XmlElement(name = "PtyEvtAdvc", required = true)
    protected PartyEventAdviceV01 ptyEvtAdvc;

    /**
     * Obtiene el valor de la propiedad ptyEvtAdvc.
     * 
     * @return
     *     possible object is
     *     {@link PartyEventAdviceV01 }
     *     
     */
    public PartyEventAdviceV01 getPtyEvtAdvc() {
        return ptyEvtAdvc;
    }

    /**
     * Define el valor de la propiedad ptyEvtAdvc.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEventAdviceV01 }
     *     
     */
    public void setPtyEvtAdvc(PartyEventAdviceV01 value) {
        this.ptyEvtAdvc = value;
    }

}
