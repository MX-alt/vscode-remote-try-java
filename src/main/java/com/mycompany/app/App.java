/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // 核心：告诉程序这是一个 Spring Boot 应用
@RestController        // 核心：允许这个类接收网页请求
public class App {

    public static void main(String[] args) {
        // 启动 Spring 应用，它会自动开启一个内嵌的 Tomcat 服务器
        SpringApplication.run(App.class, args);
    }

    // 添加一个测试接口
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s! 你的第一个 Spring Boot 接口跑通了！", name);
    }
}