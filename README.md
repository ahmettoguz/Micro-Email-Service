
<h2 id="system-startup">🚀 System Startup</h2> 

<h3 id="developer-mode">🧪 Developer Mode</h3>

* Place credentials on `application-dev.properties`

```
mvnw spring-boot:run
```

<br/>

<h3 id="production-mode">⚡Production Mode</h3> 

1. Copy `application-dev.properties` to create `application-prod.properties`.
2. Remove Swagger configurations from the properties file.
3. Follow the instructions in the [Micro-Docker-Config repository](https://github.com/ahmettoguz/Micro-Docker-Config) to configure Docker for production.