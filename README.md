# Plain Tomcat Sessions

- start application
- open terminal
- execute curl

```
:~$ curl -i -X POST http://localhost:8080/test
HTTP/1.1 200 
Set-Cookie: JSESSIONID=478E59BD6641003C456144A910523BC5; Path=/; HttpOnly
Content-Type: text/plain;charset=UTF-8
Content-Length: 2
Date: Fri, 24 Apr 2026 16:51:14 GMT

1
```

--> JSESSIONID is returned