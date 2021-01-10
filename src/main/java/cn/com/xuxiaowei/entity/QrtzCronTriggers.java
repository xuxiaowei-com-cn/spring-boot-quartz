package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * cron 触发器表
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("qrtz_cron_triggers")
public class QrtzCronTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调度程序名称
     */
    @TableField("SCHED_NAME")
    private String schedName;

    /**
     * 触发器名称
     */
    @TableField("TRIGGER_NAME")
    private String triggerName;

    /**
     * 触发器组
     */
    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    /**
     * cron 表达式
     */
    @TableField("CRON_EXPRESSION")
    private String cronExpression;

    /**
     * 时区
     */
    @TableField("TIME_ZONE_ID")
    private String timeZoneId;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String TRIGGER_NAME = "TRIGGER_NAME";

    public static final String TRIGGER_GROUP = "TRIGGER_GROUP";

    public static final String CRON_EXPRESSION = "CRON_EXPRESSION";

    public static final String TIME_ZONE_ID = "TIME_ZONE_ID";

}
