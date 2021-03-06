## bugkillers
致力成为一个中国的StackOverflow
###简介
* 官网：http://bugkillers.org
* 团队：bugkiller、Allen、UncleDb
* 代码托管：https://github.com/bugkillerz/bugkillers
* demo演示：http://bugkillers.org/api/

###成为开发者
参考：[Development And Contributing](https://github.com/bugkillerz/bugkillers/blob/master/mou/DevelpmentAndContributing.md)

###后端架构
* 后端采用Springmvc + Mybatis持久化操作.
* 基于RESTful的访问API，json交互。
* 代码管理使用git，项目构建使用maven。
* 后台ui使用swagger-ui集成。
* 项目CI平台使用jenkins。
* 安全权限框架---待定。（双向认证）
* 加密解密算法
* 使用Mencache和Redis缓存
* 使用Python的Django框架定时在像StackOverflow类似的网站抓取问题，并管理。


###前段架构
* bootstrap ui
* AngularJS mvvm
* CDN静态加速


###服务器
* CentOS6.5、unbutu12阿里云服务器
* Web容器Tomcat,Jetty，Ngnix做反向
* Mysql5.5  

### 数据库
* lvs做后端负载均衡
* Atlas 做数据库中间件实现读写分离（一主多从）

###日志
* ELK 日志监控

###备用
* Docker
* Git Book

###爬虫
https://github.com/code4craft/webmagic

###架构设计
![img](res/bugkillers.png)
