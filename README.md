1. This application is on port 8888
2. Create database by using the following MySQL command 

   ````create database emloyees````

3. Hit the hello world API
http://localhost:8888/employee/hello

4. POST data of employee from postmen to following API 
API : http://localhost:8888/employee/register

JSON
````
{
    "first_name": "John",
    "last_name": "Doe"
}
````

5. GET the employee information
API : http://localhost:8888/employee/info?emp_id=1
