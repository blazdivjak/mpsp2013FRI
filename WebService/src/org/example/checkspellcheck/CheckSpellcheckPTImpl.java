package org.example.checkspellcheck;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import org.example.businessschemas.FullCommitEntityType;
import org.example.messages.CheckSpellcheckRequestType;
import org.example.messages.CheckSpellcheckResponseType;

import org.xeustechnologies.googleapi.spelling.SpellChecker;
import org.xeustechnologies.googleapi.spelling.SpellResponse;


@WebService(name = "CheckSpellcheckPT", targetNamespace = "http://www.example.org/CheckSpellcheck", serviceName = "CheckSpellcheckService", portName = "CheckSpellcheckServicePort", wsdlLocation = "/WEB-INF/wsdl/CheckSpellcheckService.wsdl")
public class CheckSpellcheckPTImpl {
    public CheckSpellcheckPTImpl() {
    }

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://www.example.org/CheckSpellcheck/checkSpellcheck", output = "http://www.example.org/CheckSpellcheck/CheckSpellcheckPT/checkSpellcheckResponse", fault = { @FaultAction(className =
                        CheckSpellcheckFault.class, value = "http://www.example.org/CheckSpellcheck/CheckSpellcheckPT/checkSpellcheck/Fault/fault") })
    @WebMethod(action = "http://www.example.org/CheckSpellcheck/checkSpellcheck")
    @WebResult(name = "checkSpellcheckResponse", targetNamespace = "http://www.example.org/messages", partName = "return")
    public CheckSpellcheckResponseType checkSpellcheck(@WebParam(name = "checkSpellcheckRequest", partName = "in", targetNamespace = "http://www.example.org/messages")
        CheckSpellcheckRequestType in) throws CheckSpellcheckFault {
        SpellChecker checker = new SpellChecker();
        int errorCount = 0;
        for(FullCommitEntityType c: in.getCommits().getCommits()) {
            SpellResponse spellResponse = checker.check(c.getDescription());
            if(spellResponse.getCorrections() == null) {
                continue;
            }
            errorCount++;
            break;
        }
        CheckSpellcheckResponseType r = new CheckSpellcheckResponseType();
        r.setStatus(""+errorCount);
        return r;
    }
}
