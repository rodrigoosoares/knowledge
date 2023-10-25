# Summary
This project is a simple GET Endpoint using the Spring Page to handle the pageable request

# How to use it
## 1. Start Postgres
Use ```make start_postgres``` to start the PostgreSQL docker container

## 2. Run application
Use ```make run``` to start the Spring Application.
The application will run the class PopulateDatabase.java for insert into the database 100 User entities.

## 3. Call GET endpoint passing the page parameters
Can use the following curl command:
```
 curl http://localhost:8080/user\?page\=0\&size\=50
```