# Servlet Form Submission Project

## About the Project
This is a simple Java Servlet web application that collects student details through an HTML form and displays the submitted information on a result JSP page.

## Features
- Accepts student name, email, course, and age.
- Processes form data using a Java Servlet.
- Transfers data to a JSP page using request attributes.
- Displays the submitted details on `result.jsp`.

## Technologies Used
- Java
- Jakarta Servlets
- JSP (JavaServer Pages)
- Apache Tomcat
- HTML

## How It Works
1. The user enters details in a form.
2. The form submits the data to the `/hello` servlet using the POST method.
3. `HelloServlet` receives the submitted information.
4. The servlet stores the data as request attributes.
5. The servlet forwards the request to `result.jsp` to display the result.

## Servlet Mapping
`@WebServlet("/hello")`

## Project Structure
```text
Project/
├── src/main/java/
│   └── com/servlet/
│       └── HelloServlet.java
└── src/main/webapp/
    └── result.jsp
```

*Note: Add your HTML form file and other configuration files according to your project setup.*

## How to Run
1. Install Java JDK and Apache Tomcat.
2. Open the project in your IDE.
3. Configure the project with the required Servlet API dependency.
4. Deploy the application on a compatible Tomcat server.
5. Open the form in your browser and submit the details.

## Purpose
This project demonstrates basic Java Servlet concepts, form handling, request attributes, and forwarding data to a JSP page.
