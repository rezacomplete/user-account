# user-account
Restful backend code for user-account test

This code is written with Java 8 and spring boot. <br>
Please follow the below step to run it using docker: <br/>
<b>mvn clean install</b> <br/>
<b>docker build -f Dockerfile -t user-account .</b> <br/>
<b>docker run -p 8080:8080 user-account</b> <br/>

There is only one user account defined in the system (User 123). You can retrieve it by calling the Rest API like below:<br>
<b>http://localhost:8080/user-accounts/123</b> <br>
Also only one account has a transaction. You can retrieve it by:<br>
<b>http://localhost:8080/account-transactions/999</b> <br>
If you use any user other than 123 or any account number other than 999 you will recieve an empty result.<br>
<b>OR</b><br>
You can run the provided integration tests.

