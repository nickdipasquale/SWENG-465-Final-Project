
package org.me.news;

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
@WebService(name = "NewsService", targetNamespace = "http://news.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewsService {


    /**
     * 
     * @param cdc
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NewsLink")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "NewsLink", targetNamespace = "http://news.me.org/", className = "org.me.news.NewsLink")
    @ResponseWrapper(localName = "NewsLinkResponse", targetNamespace = "http://news.me.org/", className = "org.me.news.NewsLinkResponse")
    @Action(input = "http://news.me.org/NewsService/NewsLinkRequest", output = "http://news.me.org/NewsService/NewsLinkResponse")
    public String newsLink(
        @WebParam(name = "CDC", targetNamespace = "")
        boolean cdc);

    /**
     * 
     * @param safetyTip
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RandomSafetyTip")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RandomSafetyTip", targetNamespace = "http://news.me.org/", className = "org.me.news.RandomSafetyTip")
    @ResponseWrapper(localName = "RandomSafetyTipResponse", targetNamespace = "http://news.me.org/", className = "org.me.news.RandomSafetyTipResponse")
    @Action(input = "http://news.me.org/NewsService/RandomSafetyTipRequest", output = "http://news.me.org/NewsService/RandomSafetyTipResponse")
    public String randomSafetyTip(
        @WebParam(name = "SafetyTip", targetNamespace = "")
        boolean safetyTip);

}
