
# URL Hit Counter


- The aim of this project is  to count and display the number of visitor's name and count whenever they hit the Api's.
- We have used spring initializr to create the spring boot application.

![Screenshot (59)](https://user-images.githubusercontent.com/112794922/225338941-323f1a0e-1b58-454c-a94c-d21e54773d38.png)




## Frameworks and Languages used:

- SpringBoot
- Java

![Screenshot (65)](https://user-images.githubusercontent.com/112794922/225344621-da3ecd0e-d158-4a0b-bb72-1a4966d7304d.png)






## Dependency  used:

![Screenshot (65)](https://user-images.githubusercontent.com/112794922/225345455-13a3d189-ad69-4b31-9f8c-def1f14a0f85.png)


- Spring Web
- Springdoc-openapi-ui
## Data Flow:

### Model :
- It consists of a class name called UrlHit where it is typically used to "model" the data in our application.
- For eg:) we write a model class that mirrors a database table.


![Screenshot (65)](https://user-images.githubusercontent.com/112794922/225346128-e397b210-f073-4ed0-a01b-d2f544e61923.png)

### Controller:

- It consists of a class named UrlHitController which basically controls the flow of the data.
- @RestController annotation is used to make UrlHitController class as controller layer.

![Screenshot (65)](https://user-images.githubusercontent.com/112794922/225346726-d04afb9b-19c2-4a17-b9d7-d5e94bf165c2.png)


- #### API Reference

  ##### Get count

  ```http
  http://localhost:8080/api/v1/urlHit-count/username/{username}/count
  ```

### Service:

- It consists of a class called UrlHitService which helps us to add business functionalities.
- @Service annotation is use to make UrlHitService class as service layer.


![Screenshot (65)](https://user-images.githubusercontent.com/112794922/225348513-d16689eb-dfa7-4c4f-825c-7071feed93a9.png)

## View:

- The visior 1 had visited the website for 5 times , so the username and the count=5 has been displayed.

![Screenshot (44)](https://user-images.githubusercontent.com/112794922/222963321-18201c17-1594-41fd-a1d4-c743f6e93db1.png)

- The visitor 2 had visited the website 2 times , so the username and count=2 has been displayed.
![Screenshot (42)](https://user-images.githubusercontent.com/112794922/222963629-e6f1073c-43c9-4aee-bec4-577d8d68ce02.png)



## Documentation:

[Swagger](https://localhost:8080/swagger-ui.html)


## Project Summary:

- At many times we need to monitor the people visiting a website. This project can be used to count and display the visitor's name and count entering the website.
