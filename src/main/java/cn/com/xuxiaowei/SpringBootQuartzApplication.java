package cn.com.xuxiaowei;

import org.quartz.impl.jdbcjobstore.DriverDelegate;
import org.quartz.impl.jdbcjobstore.StdJDBCDelegate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序执行入口
 *
 * @author xuxiaowei
 * @see DriverDelegate 操作数据接口
 * @see StdJDBCDelegate 对于完全兼容JDBC的驱动程序，操作数据实现类
 */
@SpringBootApplication
public class SpringBootQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuartzApplication.class, args);
    }

}
