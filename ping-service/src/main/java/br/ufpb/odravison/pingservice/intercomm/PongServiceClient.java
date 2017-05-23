package br.ufpb.odravison.pingservice.intercomm;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufpb.odravison.pingservice.model.Data;

@FeignClient("pong-service")
public interface PongServiceClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
    ResponseEntity<Data> getData();

}
