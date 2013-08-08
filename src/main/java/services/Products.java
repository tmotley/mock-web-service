package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: tom
 * Date: 8/8/13
 * Time: 1:09 PM
 */
@WebService
public class Products {
    @WebMethod(action="sample_operation")
    public String operation(@WebParam(name="param_name")
                            String param) {
        // implement the web service operation here
        return "service invoked successfully";
    }
}
