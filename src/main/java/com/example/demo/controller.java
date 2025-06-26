package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class controller {
   private int currentID = 1;

   @Autowired
   public ServiceController service;

   @GetMapping("/next")
   public String handleQuiz(@RequestParam(value = "answer", required = false) String answer) {
      // Case 1: Check answer, but DO NOT move to next question
      if (answer != null) {
         return service.getAns(answer);
      }

      // Case 2: No answer provided — move to next question
      String ques = service.show(currentID);
      if (ques.equalsIgnoreCase("not more")) {
         currentID = 1;
         return "finished";
      }

      currentID++; // Only increment after showing the question
      return ques;
   }
}
