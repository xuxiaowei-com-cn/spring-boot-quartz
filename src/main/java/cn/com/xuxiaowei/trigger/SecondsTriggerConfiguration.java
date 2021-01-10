package cn.com.xuxiaowei.trigger;

import cn.com.xuxiaowei.job.Every5SecondsQuartzJob;
import cn.com.xuxiaowei.job.detail.SecondsJobDetailConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.quartz.CronScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 秒级 触发器 配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Configuration
public class SecondsTriggerConfiguration {

    private SecondsJobDetailConfiguration secondsJobDetailConfiguration;

    @Autowired
    public void setSecondsJobDetailConfiguration(SecondsJobDetailConfiguration secondsJobDetailConfiguration) {
        this.secondsJobDetailConfiguration = secondsJobDetailConfiguration;
    }

    @Bean
    public Trigger every5SecondsTrigger() {
        return TriggerBuilder.newTrigger()
                .forJob(secondsJobDetailConfiguration.every5SecondsJobDetail())
                .withIdentity(Every5SecondsQuartzJob.TRIGGER_KEY)
                .withDescription("每5秒执行一次作业的触发器")
                // 每5秒执行一次
                .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
                .build();
    }

}
