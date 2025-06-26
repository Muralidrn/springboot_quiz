package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class java_quiz {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String question;
    private String answer;
    public java_quiz(){}
    java_quiz(int id,String question,String answer)
    {
        this.id=id;
        this.question=question;
        this.answer=answer;
    }
    public int getId(){return this.id;}
    public int setId(int id){return this.id=id;}

    public String getQuestion(){return this.question;}
    public String setQuestion(String question){return this.question=question;}

    public String getAnswer(){return this.answer;}
    public String setAnswer(String answer){return this.answer=answer;}


}
