# demo

* rabbitmq-server: used by eureka
* redis-server: used by dataflow-server
* service-registry(eureka): 8761
* config-server: 8888
* gateway: 8080
* dummy-service: 8081
* admin: 8082
* dataflow-server: 9393
* dataflow-shell: 8083

### Web GUI:
* service-registry: 8761/
* admin: 8082/
* dataflow-server: 9393/dashboard

### Test URLs:

* http://localhost:8080/dummy/hello

### Notice

If config repo is empty then config-server endpoint /health will be unavailable.
