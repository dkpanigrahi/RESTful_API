# RESTful_API
<ul>
  <li><p>implement user registration and user details fetch endpoints using Spring Boot, with the specified endpoints.</p></li>
  <li>
    <h3>Set up the Spring Boot project</h3>
    <p>Create a Spring Boot project using Spring Initializr. Choose the following dependencies:</p>
        <ul>
          <li>Spring Web</li>
            <li>  Spring Data JPA<li
             <li> H2 Database (for in-memory database)</li>
        </ul>
  </li>
 
  <li>Create the User entity.</li>
  <li>Create the User repository.</li>
  <li>Create the User service.</li>
  <li>Create the User controller.</li>
  <li>Create DTOs (Data Transfer Objects).</li>
  <li>Configure application properties.</li>
  <li><h3>Running the Application</h3>
      <p>Run the application using your IDE or with the command:</p>
      <p>./mvnw spring-boot:run</p> 
  </li>
  <li><h3>Testing the Endpoints</h3></li>
  For test the endpoints using tools like Postman or cURL.</br>
  <b>Register User</b></br>
  curl -X POST "http://localhost:8080/api/user/register" -H "Content-Type: application/json" -d '{</br>
  "username": "testuser",</br>
  "password": "password",</br>
  "email": "testuser@example.com"</br>
}'</br>
<b>Get User Details</b></br>
curl -X GET "http://localhost:8080/api/user/fetch?username=testuser"

</ul>
