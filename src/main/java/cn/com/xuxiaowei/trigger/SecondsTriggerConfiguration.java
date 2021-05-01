package cn.com.xuxiaowei.trigger;

import cn.com.xuxiaowei.job.Every5SecondsQuartzJob;
import cn.com.xuxiaowei.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 秒级 触发器 配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Configuration
public class SecondsTriggerConfiguration {

    private JobDetail every5SecondsJobDetail;

    @Autowired
    public void setEvery5SecondsJobDetail(@Qualifier("every5SecondsJobDetail") JobDetail every5SecondsJobDetail) {
        this.every5SecondsJobDetail = every5SecondsJobDetail;
    }

    @Bean
    public Trigger every5SecondsTrigger() {
        // 当前时间
        LocalDateTime now = LocalDateTime.now();

        // 启动 10 秒后开始执行
        LocalDateTime triggerStartLocalDateTime = now.plusSeconds(10);
        // 转换为可用参数
        Date triggerStartTime = DateUtils.parse(triggerStartLocalDateTime);

        // 启动 100 秒后停止执行
        LocalDateTime triggerEndLocalDateTime = now.plusSeconds(120);
        Date triggerEndTime = DateUtils.parse(triggerEndLocalDateTime);

        return TriggerBuilder.newTrigger()
                .forJob(every5SecondsJobDetail)
                .withIdentity(Every5SecondsQuartzJob.TRIGGER_KEY)
                .usingJobData("触发器Key", "触发器Value")
                .withDescription("每5秒执行一次作业的触发器")
                // 每5秒执行一次
                .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
                // 设置触发器应开始的时间-触发器此时可能触发也可能不触发-取决于为触发器配置的时间表。
                // 但是，无论触发器的时间表如何，触发器都不会在此时间之前触发。
                .startAt(triggerStartTime)
                // 设置触发器将不再触发的时间-即使其计划中仍有重复的时间。
                .endAt(triggerEndTime)
                .build();
    }

}
