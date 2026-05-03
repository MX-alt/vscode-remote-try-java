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

    // 新的算法调用接口
    @GetMapping("/solve")
    public String solve(@RequestParam(value = "type", defaultValue = "TWO_SUM") String type) {
        // 1. 使用你之前的工厂模式获取对应的算法对象
        Solver solver = SolverFactory.getSolver(type);
        
        if (solver == null) {
            return "❌ 错误：未找到名为 [" + type + "] 的算法类型。";
        }

        // 2. 执行算法并直接获取返回的结果字符串
        String result = solver.solve();

        // 3. 将结果返回给浏览器
        return "✅ 算法执行成功！<br>类型: " + type + "<br>结果: " + result;
    }
}