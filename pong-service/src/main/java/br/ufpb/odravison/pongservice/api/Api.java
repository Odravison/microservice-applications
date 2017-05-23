package br.ufpb.odravison.pongservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufpb.odravison.pongservice.intercomm.PingServiceClient;
import br.ufpb.odravison.pongservice.model.Data;

@RestController
public class Api {
    
    @Autowired
    private PingServiceClient pingServiceClient;
    
    protected Logger logger = LoggerFactory.getLogger(Api.class.getName());
    
    @RequestMapping(method=RequestMethod.GET, value="/")
    public ResponseEntity<Data> getPongData(){
        logger.info("Getting Data by pong-service");
        
        return ResponseEntity.ok(new Data());
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/pong-data-from-ping")
    public ResponseEntity<Data> getDataFromPing(){
        
        logger.info("Getting Data from ping-service by pong-service");
        ResponseEntity<Data> result = null;
        
        result = pingServiceClient.getData();
        
        logger.info("Got Data from ping-service by pong-service {}", result);
        
        return result;
    }

}
