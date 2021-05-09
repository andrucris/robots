###### Project stack technologies
- java 8 
- Maven
- Lombok
- Junit 5


###### Project launch

**Build** 
`mvn clean install`

**Run Junit Tests**
`mvn test`

**Spring boot start maven**
mvn spring-boot:run


**Api Rest**
curl -v localhost:8080/events
curl -X POST localhost:8080/events/1 -H 'Content-type:application/json' -d 
curl -X PUT localhost:8080/events/robotsCount?timeIntervalMilliseconds=?3600 -H 'Content-type:application/json' -d 
