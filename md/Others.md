# Others

- what is `CSRF`?
    - the attacker tricks the user to click on his URL
    - when the user clicks on this URL, it will submit a request with all the user's active session data
    - to prevent, we use a random token for each http session
    - source: https://shorturl.at/htvH7
- what is `DispatcherServlet`?
  - `DispatcherServlet` is to dispatch incoming `HttpRequest` to the correct handlers (specified with `@Controller` annotation)
  - ref: https://www.baeldung.com/spring-dispatcherservlet
  - ref: https://shorturl.at/drDU9