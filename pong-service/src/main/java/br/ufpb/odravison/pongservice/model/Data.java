package br.ufpb.odravison.pongservice.model;

import org.springframework.http.HttpStatus;

public class Data {
    
    private HttpStatus httpStatus;
    
    public Data(){
        this.setHttpStatus(HttpStatus.OK);
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

}
