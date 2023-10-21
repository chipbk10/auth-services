## [Features](Feature.md)

## Current Issues

- permitAll is not working
  - problem: the `Application` file is not at root the package
  - solution: add an explicit base package scan, like @SpringBootApplication(scanBasePackages = "chipbk10.com.example.authservices")
  - ref: https://shorturl.at/kyCSV
- 8080 port is taken

- ref: https://github.com/spring-projects/spring-security/issues

## Debug & Trace
- logging.level.org.springframework.security=TRACE (in `application.properties`)

## Macros

- @Configuration: 
- @EnableWebSecurity:
- @Controller vs @RestController
  - @Controller: is used to mark classes as Spring MVC controller. We can return a web page.
  - @RestController: is a special controller used in RESTful Web services, it's the combination of @Controller & @ResponseBody. We cannot return a web page.
  - source: https://www.geeksforgeeks.org/difference-between-controller-and-restcontroller-annotation-in-spring/
- @GetMapping, @PostMapping
- @Valid, @RequestBody, ResponseEntity
- @PathVariable
  - is used to extract the variable from URL
  - source: https://www.baeldung.com/spring-pathvariable

## Done

- change port of the running server: `server.port=8090` (in `application.properties`)
- override the Spring Security version: https://docs.spring.io/spring-security/reference/getting-spring-security.html
- what is `CSRF`:
  - the attacker tricks the user to click on his URL
  - when the user clicks on this URL, it will submit a request with all the user's active session data
  - to prevent, we use a random token for each http session
  - source: https://shorturl.at/htvH7

## Architecture

- source: https://docs.spring.io/spring-security/reference/servlet/architecture.html

### Filters
- Filter Chain
- DelegatingFilterProxy - looks up for a filter bean or a filter chain (`FilterChainProxy`) from `ApplicationContext`
- SecurityFilterChain - is a `FilterChainProxy` 
- AuthorizationFilter