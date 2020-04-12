## 5.2 Hard coded limit service

We are creating this Limit service project to connect to springColudConfigServer

***application.property***
```properties
#======= give a name to application ========
spring.application.name=limits-service

#======= configure port ========
#server.port=8080
```

***Create bean****
```java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimistConfiguration {
    int maximum;
    int minimum;
}
```

***Create controller*** 
```java
@RestController
public class limitConfiguringController {

    @GetMapping("/limits")
    public LimistConfiguration retriveLimitsFromConfigurations(){
        return new LimistConfiguration(100,1);
    }
}
```
output:
Run this and check in postman
`01_limitService.PNG`