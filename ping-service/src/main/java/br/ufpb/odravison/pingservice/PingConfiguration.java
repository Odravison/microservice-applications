package br.ufpb.odravison.pingservice;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("br.ufpb.odravison.pingservice")
public class PingConfiguration {
    
    @Bean
    public AlwaysSampler defaultSampler() {
      return new AlwaysSampler();
    }

}
