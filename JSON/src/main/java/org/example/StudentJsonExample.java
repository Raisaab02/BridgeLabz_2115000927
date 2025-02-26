package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonExample {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "John Doe");
        student.put("age", 20);

        JSONArray subjects = new JSONArray();
        subjects.put("Mathematics");
        subjects.put("Physics");
        subjects.put("Chemistry");

        student.put("subjects", subjects);

        System.out.println(student.toString());
    }
}