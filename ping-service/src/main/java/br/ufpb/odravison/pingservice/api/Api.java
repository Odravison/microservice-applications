package br.ufpb.odravison.pingservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufpb.odravison.pingservice.intercomm.PongServiceClient;
import br.ufpb.odravison.pingservice.model.Data;

@RestController
public class Api {
    
    protected Logger logger = LoggerFactory.getLogger(Api.class.getName());
    
    private PongServiceClient pongServiceClient;
    
    
    @RequestMapping(method = RequestMethod.GET, path = "/ping-data")
    public Data getPingData(){
        
        logger.info("Getting Data by ping-service");
        
        return new Data();
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/ping-data/ping-data-from-pong/")
    public Data getDataFromPong(){
        
        logger.info("Getting Data from pong-service by ping-service");
        
        Data result = null;
        
        result = pongServiceClient.getData();
        
        logger.info("Got Data from pong-service by ping-service {}", result);
        
        return result;
    }
}
