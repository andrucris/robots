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
curl -v localhost:8080/parks
curl -v localhost:8080/parks/1
curl -X POST localhost:8080/parks -H 'Content-type:application/json' -d '{"name": "Green Park"}'
curl -X PUT localhost:8080/parks/1 -H 'Content-type:application/json' -d '{"name": "Summer Park"}'
