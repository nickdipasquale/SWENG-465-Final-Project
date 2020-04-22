
package org.me.riskservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RiskService", targetNamespace = "http://riskService.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RiskService {


    /**
     * 
     * @param cases
     * @param population
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "risk", targetNamespace = "http://riskService.me.org/", className = "org.me.riskservice.Risk")
    @ResponseWrapper(localName = "riskResponse", targetNamespace = "http://riskService.me.org/", className = "org.me.riskservice.RiskResponse")
    @Action(input = "http://riskService.me.org/RiskService/riskRequest", output = "http://riskService.me.org/RiskService/riskResponse")
    public String risk(
        @WebParam(name = "population", targetNamespace = "")
        int population,
        @WebParam(name = "cases", targetNamespace = "")
        int cases);

}
