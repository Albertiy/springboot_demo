package top.albertiy.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// 开启组件扫描和自动配置
public class SpringbootDemoApplication { // 不仅是启动引导类，还是配置类

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args); // 负责启动引导应用程序
	}
}
