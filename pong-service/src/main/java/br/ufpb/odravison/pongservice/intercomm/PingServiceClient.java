package br.ufpb.odravison.pongservice.intercomm;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufpb.odravison.pongservice.model.Data;

@FeignClient("ping-service")
public interface PingServiceClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/ping-data")
    Data getData();

}
