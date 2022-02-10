package com.group24.CI;

import org.json.JSONObject;

public class Status {


    public void test(){
        JSONObject body = new JSONObject();
        body.put("owner", "persman96");
        body.put("repo", "testtest");
        body.put("sha", "12e2fb7d5232f69535677bbb3487c0ed6078b36a");
        body.put("state", "failure");

        System.out.println(body);
    }

    public static void main(String[] args){
        JSONObject body = new JSONObject();
        body.put("owner", "persman96");
        body.put("repo", "testtest");
        body.put("sha", "12e2fb7d5232f69535677bbb3487c0ed6078b36a");
        body.put("state", "failure");

        System.out.println(body);
    }
}
