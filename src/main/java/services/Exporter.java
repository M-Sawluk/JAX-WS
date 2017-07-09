package services;

import javax.xml.ws.Endpoint;

/**
 * Created by Mike on 2017-07-09.
 */
public class Exporter {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8085/employeeservice",
                new EmployeeServiceImpl());

    }

}
