<p align="center"><a href="https://laravel.com" target="_blank"><img src="https://raw.githubusercontent.com/laravel/art/master/logo-lockup/5%20SVG/2%20CMYK/1%20Full%20Color/laravel-logolockup-cmyk-red.svg" width="400"></a></p>

<p align="center">
<a href="https://travis-ci.org/laravel/framework"><img src="https://travis-ci.org/laravel/framework.svg" alt="Build Status"></a>
<a href="https://packagist.org/packages/laravel/framework"><img src="https://img.shields.io/packagist/dt/laravel/framework" alt="Total Downloads"></a>
<a href="https://packagist.org/packages/laravel/framework"><img src="https://img.shields.io/packagist/v/laravel/framework" alt="Latest Stable Version"></a>
<a href="https://packagist.org/packages/laravel/framework"><img src="https://img.shields.io/packagist/l/laravel/framework" alt="License"></a>
</p>

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