# tp_springCloud
 This project represents the implementation of a distributed application based on Micro-services architecture using Spring cloud
 ![image](https://user-images.githubusercontent.com/40744191/221363739-98400bf1-589d-4493-9d0a-1901934e5343.png)
<h2>Content</h2>
 <ul>
  <li> Creating the microservice <a href="https://github.com/abir9hassini/tp_springCloud/tree/main/customer-service">  "Customer-service" </a>for customer management.</li>
  <li> Creating the microservice<a href="https://github.com/abir9hassini/tp_springCloud/tree/main/inventory-service"> "Inventory-service" </a>for product management.</li>
 <li>Creating the Gateway service using Spring Cloud Gateway</li>
 <li> Creating <a href="https://github.com/abir9hassini/tp_springCloud/blob/main/eureka-discovery/src/main/java/com/sid/eurekadiscovery/EurekaDiscoveryApplication.java"> Creating Registry Service directory based on NetFlix Eureka server. </a></li>
  <li> Test the proxy using a <a href="https://github.com/abir9hassini/tp_springCloud/blob/main/gateway/src/main/java/org/sid/gateway/GatewayApplication.java">dynamic configuration </a>of
Managing routes to microservices registered in
the Eureka Server directory</li>
  <li> Creating <a href="https://github.com/abir9hassini/tp_springCloud/tree/main/billing-service"> "Billing-Service" </a>using Open Feign to communicate with services
Customer and Inventory services</li>

 </ul>
