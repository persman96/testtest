package com.group24.CI;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;


public class ApacheHttpClientExample {

    /*
        test.put("owner", "persman96");
        test.put("repo", "testtest");
        test.put("sha", "12e2fb7d5232f69535677bbb3487c0ed6078b36a");
        test.put("state", "failure");
     */

    public static void main(String[] args) throws Exception {
        //String payload = """data={"owner": "persman96", "repo": "testtest", "sha": "12e2fb7d5232f69535677bbb3487c0ed6078b36a", "state": "failure"}""";
        String payload = "{\"value\": {\"owner\": \"persman96\",\"repo\": \"testtest\",\"sha\": \"12e2fb7d5232f69535677bbb3487c0ed6078b36a\",\"state\": \"failure\"}}";
        /*"""
                data={
                    "username": "admin",
                    "first_name": "System",
                    "last_name": "Administrator"
                }
                """;*/
        StringEntity entity = new StringEntity(payload,
                ContentType.APPLICATION_FORM_URLENCODED);

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost("https://api.github.com/repos/persman96/testtest/statuses/12e2fb7d5232f69535677bbb3487c0ed6078b36a");
        request.setEntity(entity);

        HttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().getStatusCode());
    }

}

