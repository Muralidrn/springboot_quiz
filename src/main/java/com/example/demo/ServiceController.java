package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceController {

    private java_quiz data;
   @Autowired
    private  ServiceRepository repo;
    public Iterable<java_quiz> getall()
    {
        return repo.findAll();
    }
    public String show(int id){
        Optional<java_quiz> row=repo.findById(id);
        if(row.isPresent())
        {
            data =row.get();
            return  data.getQuestion();

        }
        return  "not more";
    }
    public String getAns(String keyword)
    {
        if (data == null) {
            return "No question loaded. Call /quiz/next first.";
        }
        if(data.getAnswer().equalsIgnoreCase(keyword))
        {
            return "correct";
        }
        else{
            return "wrong answer ;\n correct answer is "+data.getAnswer();
        }

    }
}
