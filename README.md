Levind Sein test API Java Springboot with Maven

+ Hello World

GET = localhost:9090/api/hello

+ Create or update

POST = localhost:9090/api/{id}
// Request Body
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