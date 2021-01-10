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
package cn.com.xuxiaowei.job.detail;

import cn.com.xuxiaowei.job.Every5SecondsQuartzJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 秒级 作业详情 配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Configuration
public class SecondsJobDetailConfiguration {

    @Bean
    public JobDetail every5SecondsJobDetail() {
        return JobBuilder.newJob(Every5SecondsQuartzJob.class)
                .withIdentity(Every5SecondsQuartzJob.JOB_KEY)
                .withDescription("每5秒执行一次作业的详情")
                .storeDurably()
                .build();
    }

}
