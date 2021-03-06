# ocr-web
[![CircleCI](https://circleci.com/gh/ryanjbaxter/ocr-web.svg?style=svg)](https://circleci.com/gh/ryanjbaxter/ocr-web)

Web app for OCR Spring Cloud Demo from my [blog](http://ryanjbaxter.com).  This application uses 
[Zuul from Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-static/spring-cloud.html#_router_and_filter_zuul)
to route requests to various services.

## Running

This is a simple Spring Boot application that you can run easily by just cloning the repository.

```
$ git clone https://github.com/ryanjbaxter/ocr-web
$ cd ocr-web
$ ./mvnw spring-boot:run
```
Alternatively you can run the application using Docker, there is an 
[image](https://hub.docker.com/r/ryanjbaxter/ocr-web/) on Docker Hub.

```
$ docker run -p 8080:8080 -i ryanjbaxter/ocr-web
```

## Usage
This app requires [Eureka](https://github.com/ryanjbaxter/ocr-eureka), 
[OCR Races](https://github.com/ryanjbaxter/ocr-races), and [OCR Participants](https://github.com/ryanjbaxter/ocr-participants) 
to work correctly.

Once running open your browser and go to `http://localhost:8080`.
