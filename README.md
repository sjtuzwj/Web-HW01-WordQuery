# Docker Task
Docker镜像存储于ataraxiazwj/wordquery仓库，已public 
[链接](https://hub.docker.com/r/ataraxiazwj/wordquery)     
下载后使用docker run --name app -p 8080:80 -d ataraxiazwj/wordquery:v0.0即可

微服务：
分为login docker 于8000端口和 app docker 于8080端口，由于Oauth2在现有知识水平下过于复杂bug横出，故只用了最简单的http协议直接进行服务之间的通信，n由app向login发出请求，并对新增的api做了test。
windows上docker已经炸了，所以直接在linux打包了现成的jar。
