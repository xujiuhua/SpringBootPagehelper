
SpringBoot PageHelper

## 配置jar

```gradle
compile(
	'com.github.pagehelper:pagehelper:4.1.6'
)
```

## 配置分页插件

```java
//分页插件
PageHelper pageHelper = new PageHelper();
Properties properties = new Properties();
properties.setProperty("reasonable", "true");
properties.setProperty("supportMethodsArguments", "true");
properties.setProperty("returnPageInfo", "check");
properties.setProperty("params", "count=countSql");
properties.setProperty("pageSizeZero", "true");
pageHelper.setProperties(properties);

//添加插件
sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});
```

## 编写service

```java
public List<User> getByPage(Integer pageNo, Integer pageSize) {
    if (pageNo != null && pageSize != null) {
        PageHelper.startPage(pageNo, pageSize, "id");
    }
    return userDao.getByPage();
}
```