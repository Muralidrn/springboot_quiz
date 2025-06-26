# Spring Boot Quiz App (Command Line/API)

## Description

This is a simple Spring Boot project using MVC architecture that provides a quiz system via REST APIs.

There is no user interface — only API calls using browser, Postman, or curl.

## How It Works

- **GET /quiz/next** — Returns next question
- **GET /quiz/next/{answer}** — Checks your answer

## Example

```bash
$ curl http://localhost:8080/quiz/next
Question: What is Java?

$ curl http://localhost:8080/quiz/next/ObjectOriented
correct
