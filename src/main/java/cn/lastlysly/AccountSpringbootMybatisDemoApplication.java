package cn.lastlysly;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AccountSpringbootMybatisDemoApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AccountSpringbootMybatisDemoApplication.class);
	}

	public static void main(String[] args) {
//		SpringApplication.run(AccountSpringbootMybatisDemoApplication.class, args);
		SpringApplication springApplication = new SpringApplication(AccountSpringbootMybatisDemoApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF); //关闭banner
		springApplication.run(args);
	}
}
