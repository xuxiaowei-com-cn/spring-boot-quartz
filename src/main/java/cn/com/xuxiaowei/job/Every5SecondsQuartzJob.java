/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.xuxiaowei.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 每5秒执行一次作业
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Configuration
public class Every5SecondsQuartzJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("每5秒执行一次作业 开始");


        log.info("每5秒执行一次作业 结束");
    }

    @Bean
    public JobDetail every5SecondsJobDetail() {
        return JobBuilder.newJob(this.getClass())
                .withIdentity("second5", "second")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger every5SecondsTrigger() {
        return TriggerBuilder.newTrigger()
                .forJob(every5SecondsJobDetail())
                // 每5秒执行一次
                .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
                .build();
    }

}
