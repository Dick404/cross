
package com.csg.exchange.service.webserviceClient;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.csg.exchange.service.webserviceClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.csg.exchange.service.webserviceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PushAlertInfoRequest }
     * 
     */
    public PushAlertInfoRequest createPushAlertInfoRequest() {
        return new PushAlertInfoRequest();
    }

    /**
     * Create an instance of {@link AlertInfo }
     * 
     */
    public AlertInfo createAlertInfo() {
        return new AlertInfo();
    }

    /**
     * Create an instance of {@link PushAlertInfoResponse }
     * 
     */
    public PushAlertInfoResponse createPushAlertInfoResponse() {
        return new PushAlertInfoResponse();
    }

}
