
# Email Sending App

This is a simple Spring Boot project for email sending.This project for educational purpose only. 



## Features

- Send simple emails
- Basic user interface for inputting email details


## Tech Stack

- **Backend:** Spring Boot, JavaMailSender
- **Frontend:** Thymeleaf, HTML, CSS, JavaScript
- **Build Tool:** Maven
- **Database:** (for now no database needed. )
- **Others:** SMTP for email sending (Gmail SMTP server used in configuration)

## Prerequisites

- Java 8 or higher
- Maven
- An email account (Gmail recommended for simplicity)

## Configure your email credentials

- Add your email ID and password in the application.properties file located in         src/main/resources/.
-spring.mail.host=smtp.gmail.com
-spring.mail.port=587
-spring.mail.username=your.email@example.com
-spring.mail.password=yourpassword
-spring.mail.properties.mail.smtp.auth=true
-spring.mail.properties.mail.smtp.starttls.enable=true

## Create a temporary gmail password
- Login to your account
- Go to Manage your Google Account
- Search for App Passwords
- Add you App name and click on Create
- Then it will generate your app password
- copy that password and paste in the application.properties file 
- Example: spring.mail.password= **your generated app password**


### Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/prasadk30/Email_Sending_App.git
   cd email-sending-app





