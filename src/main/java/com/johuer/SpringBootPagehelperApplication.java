package com.johuer;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.johuer.dao")
public class SpringBootPagehelperApplication {

	@Autowired
	private org.apache.tomcat.jdbc.pool.DataSource dataSource;

	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

		// 设置数据源
		sqlSessionFactoryBean.setDataSource(dataSource);

		// 设置mybatis的xml目录
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));

		// 分页插件
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		// 配置含义参见 http://git.oschina.net/free/Mybatis_PageHelper/blob/master/wikis/HowToUse.markdown
		properties.setProperty("reasonable", "true");				// 查询合理化
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "count=countSql");
		properties.setProperty("pageSizeZero", "true");				//&pageSize=0 查询全部数据
		pageHelper.setProperties(properties);

		//添加插件
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});

		return sqlSessionFactoryBean.getObject();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPagehelperApplication.class, args);
	}
}
