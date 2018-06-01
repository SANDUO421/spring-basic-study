#spring 基础配置学习项目

-**spring 的配置基础配置项目**
- **项目创建**
- **基础配置**
- **高级配置**
- **测试**
-------------------
##项目构建

```
	<properties>
  	<java.version>1.8</java.version>
  </properties>
  <dependencies>
  	<dependency>
  		<groupId>org.springframework</groupId>
  		<artifactId>spring-context</artifactId>
  		<version>4.3.8.RELEASE</version>
  	</dependency>
  </dependencies>
  <build>
  	<plugins>
  		<plugin>
  			<groupId>org.apache.maven.plugins</groupId>
  			<artifactId>maven-compiler-plugin</artifactId>
  			<version>2.3.2</version>
  			<configuration>
  				<source>${java.version}</source>
  				<target>${java.version}</target>
  			</configuration>
  		</plugin>
  	</plugins>
  </build>
```
##项目基础配置