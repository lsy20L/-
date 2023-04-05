package com.lab1;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import java.lang.reflect.Method;

public class ClientRun {
    public static void main(String[] args){
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
//        Client client = dcf.createClient("http://localhost:8080/service/reader?wsdl");
        Client client = dcf.createClient("http://localhost:8080/service/readerService2?wsdl");
        Object[] objects;
        try{
            objects=client.invoke("getReaders");
            System.out.println(objects[0].toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
