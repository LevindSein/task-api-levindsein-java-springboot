<p align="center"><img src="https://seeklogo.com/images/S/spring-boot-logo-9D6125D4E7-seeklogo.com.png" width="400"></p>

<p align="center">Levind Sein test API Java Springboot with Maven</p>

Usage
-----

:heavy_check_mark: Hello World

<b>GET</b> = localhost:9090/api/hello

-----

:heavy_check_mark: Create or update

<b>POST</b> = localhost:9090/api/{id}  
=> Request Body  
{  
   "firstName" : "foo",  
   "lasName" : "foo"  
}

-----

:heavy_check_mark: Read by Id

<b>GET</b> = localhost:9090/api/{id}

:heavy_check_mark: Read All

<b>GET</b> = localhost:9090/api/all

-----

:heavy_check_mark: Delete by Id

<b>POST</b> = localhost:9090/api/destroy/{id}

Configuration
------------- 
```
src/main/resources/application.properties
```
```
server.port = 9090  
db_name => spring_boot
```
```
Database Migration => Spring Data JPA
```