# microservice-applications
Structure of a microservice applications used to make an experiment with a goal to compare microservice and monolithic applications. The result is found here: {LINK_TO_PAPER}

----

## Description
This application has two simple services `ping-service and pong-service`. As well, has the `discovery-service` that use Eureka to discover services and `gateway-service` that use Zuul Proxy to provide a unique access point for this application.

All services returns a HttpStatus OK. It's possible to request a service through another service.

---

## Usage

After run project you can request the follows endpoints
```
Method: GET

/ping-data
/ping-data/ping-data-from-pong

/pong-data
/pong-data/pong-data-from-ping
```
