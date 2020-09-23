package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("qrtz_fired_triggers")
public class QrtzFiredTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SCHED_NAME")
    private String schedName;

    @TableField("ENTRY_ID")
    private String entryId;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("INSTANCE_NAME")
    private String instanceName;

    @TableField("FIRED_TIME")
    private Long firedTime;

    @TableField("SCHED_TIME")
    private Long schedTime;

    @TableField("PRIORITY")
    private Integer priority;

    @TableField("STATE")
    private String state;

    @TableField("JOB_NAME")
    private String jobName;

    @TableField("JOB_GROUP")
    private String jobGroup;

    @TableField("IS_NONCONCURRENT")
    private String isNonconcurrent;

    @TableField("REQUESTS_RECOVERY")
    private String requestsRecovery;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String ENTRY_ID = "ENTRY_ID";

    public static final String TRIGGER_NAME = "TRIGGER_NAME";

    public static final String TRIGGER_GROUP = "TRIGGER_GROUP";

    public static final String INSTANCE_NAME = "INSTANCE_NAME";

    public static final String FIRED_TIME = "FIRED_TIME";

    public static final String SCHED_TIME = "SCHED_TIME";

    public static final String PRIORITY = "PRIORITY";

    public static final String STATE = "STATE";

    public static final String JOB_NAME = "JOB_NAME";

    public static final String JOB_GROUP = "JOB_GROUP";

    public static final String IS_NONCONCURRENT = "IS_NONCONCURRENT";

    public static final String REQUESTS_RECOVERY = "REQUESTS_RECOVERY";

}
