
# URL Hit Counter


        The aim of this project is  to count and display the number of visitor's name and count whenever they hit the Api's.



## Frameworks and Languages used:

- SpringBoot
- Java






## Dependency  used:

- Spring Web
- Springdoc-openapi-ui
## Data Flow:

### Model :
- It consists of a class name called UrlHit where it is typically used to "model" the data in our application.
- For eg:) we write a model class that mirrors a database table.

### Controller:

- It consists of a class named UrlHitController which basically controls the flow of the data.
- @RestController annotation is used to make UrlHitController class as controller layer.
- #### API Reference

  ##### Get count

  ```http
  http://localhost:8080/api/v1/urlHit-count/username/{username}/count
  ```

### Service:

- It consists of a class called UrlHitService which helps us to add business functionalities.
- @Service annotation is use to make UrlHitService class as service layer.

## View:

- THe visior 1 had visited the website for 5 times , so the username and the count=5 has been displayed.

![Screenshot (44)](https://user-images.githubusercontent.com/112794922/222963321-18201c17-1594-41fd-a1d4-c743f6e93db1.png)


## Documentation:

[Swagger](https://localhost:8080/swagger-ui.html)


## Project Summary:

       At many times we need to monitor the people visiting a website. This project can be used to count and display the visitor's name and count entering the website.
