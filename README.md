# mcptest

Spring Boot 2.6.6 项目，使用Java 17开发的多模块Maven项目

## 项目结构

- **mcptest-api**: API接口模块
- **mcptest-provider**: 服务实现模块

## 技术栈

- Java 17
- Spring Boot 2.6.6
- Maven 多模块
- Dubbo 微服务框架
- Nacos 配置中心
- MySQL 数据库

## 启动说明

增加启动参数：`--enable-preview --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.math=ALL-UNNAMED`