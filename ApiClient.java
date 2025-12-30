import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.time.Duration;

public class ApiClient {

    // Perform a GET request
    public static void sendGetRequest(String url) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(10)) // Timeout for safety
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("GET Response Code: " + response.statusCode());
            System.out.println("GET Response Body: " + response.body());
        } catch (HttpTimeoutException e) {
            System.err.println("Request timed out.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Error during GET request: " + e.getMessage());
        }
    }

    // Perform a POST request with JSON body
    public static void sendPostRequest(String url, String jsonBody) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(10))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("POST Response Code: " + response.statusCode());
            System.out.println("POST Response Body: " + response.body());
        } catch (HttpTimeoutException e) {
            System.err.println("Request timed out.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Error during POST request: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example GET request
        sendGetRequest("https://jsonplaceholder.typicode.com/posts/1");

        // Example POST request
        String json = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        sendPostRequest("https://jsonplaceholder.typicode.com/posts", json);
    }
}
