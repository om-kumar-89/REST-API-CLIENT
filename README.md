# REST-API-CLIENT
Company : CODTECH IT SOLUTIONS

Name : OM KUMAR

Intern ID:CTIS1562

Domain : JAVA DEVELOPMENT

Duration : 4 weeks

Mentor : NEELA SANTHOSH


Description:

The `ApiClient` program demonstrates how to make HTTP requests in Java using the modern `java.net.http.HttpClient` API introduced in Java 11. It includes two key methods: one for sending GET requests and another for sending POST requests with JSON data.

The `sendGetRequest(String url)` method creates an `HttpClient` object and builds an `HttpRequest` using the provided URL. A timeout is usually applied to prevent the program from waiting indefinitely. The request is then sent, and the response is captured as a string. The program prints both the HTTP status code and the response body. If a timeout or network error occurs, it is handled gracefully and an appropriate message is displayed.

The `sendPostRequest(String url, String jsonData)` method works similarly but uses the POST method. It attaches the JSON payload to the request body and adds the `Content-Type: application/json` header so the server knows how to interpret the data. The response and status code are again printed to the console.

In the `main` method, example URLs from a test API service are used to demonstrate both request types. Overall, this program provides a clear and practical example of how Java applications can interact with web APIs.


Key Features:

Java 11+ HttpClient — No external libraries needed.
Timeout Handling — Prevents hanging requests.
Error Handling — Catches network and timeout errors.
JSON POST Support — Sends JSON payloads with correct headers.
Self-contained — Can be compiled and run directly.


Output:

<img width="1707" height="459" alt="Image" src="https://github.com/user-attachments/assets/305859fd-25fa-4fda-879d-d2456b416444" />
