package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.entity.Quartz;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * quartz 定时任务表 服务类 测试类
 *
 * @author xuxiaowei
 */
@Slf4j
@SpringBootTest
class IQuartzServiceTests {

    @Autowired
    private IQuartzService iQuartzService;

    @Test
    void list() {
        List<Quartz> quartzList = iQuartzService.list();
        for (Quartz quartz : quartzList) {
            log.info(String.valueOf(quartz));
        }
    }

}
