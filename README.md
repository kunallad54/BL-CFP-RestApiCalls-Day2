# BL-CFP-RestApiCalls-Day2

## USECASES :
1. Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
   To begin with show Hello from BridgeLabz
   - Use GET Request Method
   - Use CURL to demonstrate the REST API Call
   - curl localhost:8080/hello -w "\n"
   
2. Make REST Call to show Hello Krunal Welcome to BridgeLabz
   - Use GET Request Method and pass name as query parameter
   - Use CURL to demonstrate the REST API Call
   - curl localhost:8080/hello/query?name=Krunal -w "\n"
   
3. Make REST Call to show Hello Krunal Welcome to BridgeLabz
   - Use GET Request Method and pass name as path variable
   - Use CURL to demonstrate the REST API Call
   - curl localhost:8080/hello/param/Krunal -w "\n"
   
4. Make REST Call to show Hello Krunal Lad Welcome to BridgeLabz
   - Use POST Request Method and pass first name and last name in the Body
   - Create User DTO Bean with firstName and lastName as attributes.
   - Use CURL to demonstrate the REST API Call
   - curl -X POST -H "Content-Type: application/json" -d '{"firstName": ”Krunal","lastName": ”Lad"}' "http://localhost:8080/hello/post" -w "\n"
   
5. Make REST Call to show Hello Krunal Lad Welcome to BridgeLabz
   - Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter
   - Use CURL to demonstrate the REST API Call
   - curl -X PUT localhost:8080/hello/put/Mark/?lastName=Taylor -w "\n"
