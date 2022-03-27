# Microservice structure using Spring Boot

> This is a simple microservice structure whose aim is to generate the payroll of the workers of a company. There are four different microservices: 
> payroll ms, workers ms, auth ms, user ms. The payroll microservice is supposed to talk the one of workers to get information about the employee. 
> Furthermore, there are auth ms and user ms which are used to control permitions. The structure also counts on a Gateway Zuul, Eureka Server and a config server that 
> accesses information at git repository. 

## Technologies used
 - Feign
 - Ribbon
 - Hystrix
 - OAuth
 - JWT
 - Discovery Server Eureka
 - API Gateway
 - Config Server
