package com.lab1;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.lab1.IReaderService",serviceName = "readerService")
public class ReaderService implements IReaderService {
    @Override
    public Reader getReader(@WebParam(name = "name1") String name, @WebParam(name = "password") String password) {
        return new Reader(name,password);
    }

    @Override
    public List<Reader> getReaders() {
        List<Reader> readerList = new ArrayList<>();
        readerList.add(new Reader("shun1","123"));
        readerList.add(new Reader("shun2","123"));
        return readerList;
    }
}
