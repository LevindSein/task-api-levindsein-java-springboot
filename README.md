<p align="center"><img src="https://seeklogo.com/images/S/spring-boot-logo-9D6125D4E7-seeklogo.com.png" width="400"></p>

Levind Sein test API Java Springboot with Maven

+ Hello World

GET = localhost:9090/api/hello

+ Create or update

POST = localhost:9090/api/{id}  
=> Request Body  
{  
   "firstName" : "foo",  
   "lasName" : "foo"  
}

+ Read by Id

GET = localhost:9090/api/{id}

+ Read All

GET = localhost:9090/api/all

+ Delete by Id

POST = localhost:9090/api/destroy/{id}

========================================

Configuration -> src/main/resources/application.properties

server.port = 9090  
db_name => spring_boot

Database Migration => Spring Data JPA