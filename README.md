# Spring Boot 3 JDBC Sessions

- start application
- open terminal
- execute curl

```
:~$ curl -i -X POST http://localhost:8080/test
HTTP/1.1 200 
Set-Cookie: SESSION=ZmNlNzk0ODQtMDc1ZS00ZTA2LTkzYmQtNjlhOTBiNjlhZTZk; Path=/; HttpOnly; SameSite=Lax
Content-Type: text/plain;charset=UTF-8
Content-Length: 2
Date: Fri, 24 Apr 2026 16:56:10 GMT

1
```

--> SESSION is returned