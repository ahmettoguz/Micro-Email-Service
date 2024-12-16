<h1 id="top" align="center">🚢 Release Version 1.2.0</h1> 

<br/>

## 🔍 Table of Contents

- [Software Versions](#software-versions)
- [Features](#features)
- [Next Release Features](#next-release-features)
- [Prerequisites](#prerequisites)
- [System Startup](#system-startup)
  - [Developer Mode](#developer-mode)
  - [Production Mode](#production-mode)
- [Endpoint Documentation](#endpoint-documentation)
- [Manual Testing](#manual-testing)

<br/>

<h2 id="software-versions">🏷️ Software Versions</h2>

| Software     | Version    |
|--------------|------------|
| Java         | 23         |
| Spring Boot  | 3.4.0      |
| Swagger      | 2.7.0      |
| Apache Maven | 3.9.5      |
 
<br/>

<h2 id="features">🔥 Features</h2>

+ **Postman Endpoint Collection:** Postman collection added for ensure validation of all API endpoints.
+ **Swagger Documentation:** Comprehensive API documentation integrated for documentation and testing purposes.
+ **Environment Configuration:** Configurations have been adjusted for enhanced flexibility.
+ **Dockerization:** The application is containerized for consistent deployment and scaling.

<br/>

<h2 id="next-release-features">🚧 Next Release Features</h2>

- Not planning any feautres.

<br/>

<h2 id="prerequisites">🔒 Prerequisites</h2>

Google removed plain-text authentication on September 30, 2024. To send emails using a Google account, you now need to enable 2-Step Verification and use an app password.

<br/>

* Go to your Google Account settings at [`myaccount.google.com`](https://myaccount.google.com/).
* In the navigation panel, select [`Security`](https://myaccount.google.com/security).
* Under `How you sign in to Google`, select `2-Step Verification`.
* Add your phone number as a verification method.
* Go to  [`myaccount.google.com/u/1/apppasswords`](https://myaccount.google.com/u/1/apppasswords) and generate a new app password.

<br/>
  
<h2 id="system-startup">🚀 System Startup</h2> 

<h3 id="developer-mode">🧪 Developer Mode</h3>

* Place credentials in the `application-dev.properties` file.

```
mvnw spring-boot:run
```

<br/>

<h3 id="production-mode">⚡Production Mode</h3> 

* Copy `application-dev.properties` to create `application-prod.properties`.
* Change `app.var.appMode` to `prod`.
* Change `server.port` to `80`.
* Place credentials.
* Follow the instructions in the [`Micro-Docker-Config repository`](https://github.com/ahmettoguz/Micro-Docker-Config) to configure Docker for production.

<br/>

<h2 id="endpoint-documentation">📍 Endpoint Documentation</h2>
You can access the full API documentation using Swagger UI.

To view the documentation visit: [`sw/swagger-ui/index.html`](https://localhost/sw/swagger-ui/index.html)

![endpoint-doc](assets/endpoint-doc/endpoint-doc.png)

<br/>

<h2 id="manual-testing">🔬 Manual Testing</h2>

To run the Postman tests, first import the Postman collection file from the path `assets/postman-request` into Postman by selecting the `Import` option. After importing, locate the collection in Postman, execute the individual requests for each. Review the responses to ensure that the endpoints are functioning as expected.

### [🔝](#top)
