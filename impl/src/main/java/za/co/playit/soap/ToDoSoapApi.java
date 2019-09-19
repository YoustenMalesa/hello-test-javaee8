package za.co.playit.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "ToDoSoapApiService", portName = "ToDoSoapApiPort", targetNamespace = ToDoSoapApi.NS)
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class ToDoSoapApi {
    public static  final String NS = "http://playit-solutions.co.za/api/service/todo";
}
