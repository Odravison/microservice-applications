package br.ufpb.odravison.pingservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufpb.odravison.pingservice.intercomm.PongServiceClient;
import br.ufpb.odravison.pingservice.model.Data;

@RestController
public class Api {
    
    protected Logger logger = LoggerFactory.getLogger(Api.class.getName());
    
    @Autowired
    private PongServiceClient pongServiceClient;
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<Data> getPingData(){
        
        logger.info("Getting Data by accessing GETDATALVL1 On Ping-service");
        
        return ResponseEntity.ok(new Data());
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/lvl2")
    public ResponseEntity<Data> getDataLvl2(){
        
        logger.info("Getting Data by accessing GETDATALVL2 On Ping-service");
        
        ResponseEntity<Data> result = null;
        
        result = pongServiceClient.getDataLvl2();
        
        logger.info("Got Data by accessed GETDATALVL2 On Ping-service {}", result);
        
        return result;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/lvl3")
    public ResponseEntity<Data> getDataFromPong(){
        
        logger.info("Getting Data from pong-service by ping-service On Ping-service");
        
        ResponseEntity<Data> result = null;
        
        result = pongServiceClient.getDataLvl3();
        
        logger.info("Got Data from pong-service by ping-service On Ping-service {}", result);
        
        return result;
    }
}
