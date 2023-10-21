# Architecture

- ref: https://docs.spring.io/spring-security/reference/servlet/architecture.html

### Filters
- Filter Chain
- DelegatingFilterProxy - looks up for a filter bean or a filter chain (`FilterChainProxy`) from `ApplicationContext`
- SecurityFilterChain - is a `FilterChainProxy`
- AuthorizationFilter