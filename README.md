# user-account
Restful backend code for user-account test

This code is written with Java 8 and spring boot. <br>
Open the project with Intellij or build it using maven and run the <b>com.rezacomplete.UserAccountApplication</b> class.<br>
There is only one user account defined in the system (User 123). You can retrieve it by calling the Rest API like below:<br>
<b>http://localhost:8080/user-accounts/123</b> <br>
Also only one account has a transaction. You can retrieve it by:<br>
<b>http://localhost:8080/account-transactions/999</b> <br>
If you use any user other than 123 or any account number other than 999 you will recieve an empty result.<br>
<b>OR</b><br>
You can run the provided integration tests.

