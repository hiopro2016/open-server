# 卡尔开放平台快速开发框架

# 技术选型

| 技术 |名称|版本|官网
|:---------|:-------|:-------|:-------|
|swagger-api|内部api文档|2.7.0|http://springfox.github.io/springfox/docs/current/
|spring boot|容器|1.5.9-RELEASE|http://projects.spring.io/spring-boot/


## 子系统

| 系统名称 |备注|
|:---------|:-------|
|wiki-server|接口文档服务|
|upms-server|用户管理服务|
|auth-server|授权认证服务|
|resource-server|接口中央服务|
|user-server|用户中心服务|

> 前期会考虑把接口文档服务以及用户服务集成在一起



### wiki-server

* 支持全文搜索发布的接口文档
* 支持markdown书写接口文档
* 支持弹窗登录到用户管理服务
* 接口文档标准化


### upms-server

* 用户注册审核
* 应用上线审核
* 协议签订
* 权限审核分配
* 用户装填检测


### auth-server

> 需要跟upms进行认证数据对接，注册的用户应用才能进行认证

* 采用spring security oauth2协议
* 认证方式管理
* 单点登录


### resource-server

* 接口资源注册
* 接口单元测试
* 接口访问监控


### user-server

* 用户注册
* 用户个人信息
* 应用申请（秘钥分配，应用基本信息）
* 应用审核上线
* 第三方登录
