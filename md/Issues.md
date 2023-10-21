# Current Issues

- ref: https://github.com/spring-projects/spring-security/issues

## Solved

- permitAll is not working
    - problem: the `Application` file is not at root the package
    - solution: add an explicit base package scan, like `@SpringBootApplication(scanBasePackages = "chipbk10.com.example.authservices")`
    - ref: https://shorturl.at/kyCSV

- how to kill processes that are running on 8080 port:
    - lsof -i tcp:8080
    - kill -9 pID

- how to change the port of the running server?
  - in `application.properties`: `server.port=8090`
- how to override the Spring Security version? 
  - ref: https://docs.spring.io/spring-security/reference/getting-spring-security.html