<h1 id="top" align="center">🚢 Release Version 1.1.1</h1> 

<br/>

## 🔍 Table of Contents

- [Features](#features)
- [Next Release Features](#next-release-features)
- [System Startup](#system-startup)
  - [Developer Mode](#developer-mode)
  - [Production Mode](#production-mode)
- [Endpoint Documentation](#endpoint-documentation)
- [Manuel Testing](#manuel-testing)
 
<br/>

<h2 id="features">🔥 Features</h2>

+ **External Communication:** Manage communication with frontend.
+ **Manual Testing:** Postman used for endpoint testing.
+ **Swagger Documentation:** API documentation integrated for streamlined development.
+ **Environment Configuration:** Variables have been adjusted for optimal flexibility.
+ **Dockerization:** The application is containerized for consistent deployment.

<br/>

<h2 id="next-release-features">🚧 Next Release Features</h2>

- Internal communication with frontend.

<br/>
  
<h2 id="system-startup">🚀 System Startup</h2> 

<h3 id="developer-mode">🧪 Developer Mode</h3>

* Place credentials in the `application-dev.properties` file.

<br/>
  
#### Using command line

```
mvnw spring-boot:run
```

#### Using Docker

```
docker build -t micro-email-image .

docker run -d -p 8080:80 --name micro-email-container micro-email-image

docker ps -a

docker rm -f micro-email-container
```

<br/>

<h3 id="production-mode">⚡Production Mode</h3> 

* Copy `application-dev.properties` to create `application-prod.properties`.
* change `app.var.appMode` to `prod`.
* change `server.port` to `80`.
* Place credentials in the `application-dev.properties` file.
* Follow the instructions in the [`Micro-Docker-Config repository`](https://github.com/ahmettoguz/Micro-Docker-Config) to configure Docker for production.
  
<br/>

<h2 id="endpoint-documentation">📍 Endpoint Documentation</h2>

![endpoint-doc](src/main/resources/assets/endpoint-doc/endpoint-doc.png)

<br/>

<h2 id="manuel-testing">🔬 Manual Testing</h2>

To run the Postman tests, first import the Postman collection file from the path ./src/main/resources/postman-request/ into Postman by selecting the "Import" option. After importing, locate the collection in Postman, execute the individual requests for each. Review the responses to ensure that the endpoints are functioning as expected.


### [🔝](#top)
