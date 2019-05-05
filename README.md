# Docker Task
## 地址
Docker镜像存储于ataraxiazwj/wordquery仓库，已public 
[链接](https://hub.docker.com/r/ataraxiazwj/wordquery)     
下载后使用docker run --name app -p 8080:80 -d ataraxiazwj/wordquery:v0.0即可

## 微服务
分为login docker 于8000端口和 app docker 于8080端口，由于Oauth2在现有知识水平下过于复杂bug横出，故这里就只用了最简单基础的http协议接口直接进行服务之间的通信，n由app向login发出get请求，传递用户名和密码作为参数，返回是否认证通过的boolean值，并对新增的api做了test。

## 测试方法
输入api，运行app docker，localhost:8080/wordquery/search/I?username=a&password=b（最原始的get方法），由app服务在内部的restTemplate访问另一个微服务login接口，返回是否通过认证，如果通过认证，则接口能返回正常数据，否则不显示。
