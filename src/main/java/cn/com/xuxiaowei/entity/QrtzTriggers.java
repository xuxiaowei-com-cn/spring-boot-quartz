package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 触发器表
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("qrtz_triggers")
public class QrtzTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SCHED_NAME")
    private String schedName;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("JOB_NAME")
    private String jobName;

    @TableField("JOB_GROUP")
    private String jobGroup;

    @TableField("DESCRIPTION")
    private String description;

    @TableField("NEXT_FIRE_TIME")
    private Long nextFireTime;

    @TableField("PREV_FIRE_TIME")
    private Long prevFireTime;

    @TableField("PRIORITY")
    private Integer priority;

    @TableField("TRIGGER_STATE")
    private String triggerState;

    @TableField("TRIGGER_TYPE")
    private String triggerType;

    @TableField("START_TIME")
    private Long startTime;

    @TableField("END_TIME")
    private Long endTime;

    @TableField("CALENDAR_NAME")
    private String calendarName;

    @TableField("MISFIRE_INSTR")
    private Integer misfireInstr;

    @TableField("JOB_DATA")
    private String jobData;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String TRIGGER_NAME = "TRIGGER_NAME";

    public static final String TRIGGER_GROUP = "TRIGGER_GROUP";

    public static final String JOB_NAME = "JOB_NAME";

    public static final String JOB_GROUP = "JOB_GROUP";

    public static final String DESCRIPTION = "DESCRIPTION";

    public static final String NEXT_FIRE_TIME = "NEXT_FIRE_TIME";

    public static final String PREV_FIRE_TIME = "PREV_FIRE_TIME";

    public static final String PRIORITY = "PRIORITY";

    public static final String TRIGGER_STATE = "TRIGGER_STATE";

    public static final String TRIGGER_TYPE = "TRIGGER_TYPE";

    public static final String START_TIME = "START_TIME";

    public static final String END_TIME = "END_TIME";

    public static final String CALENDAR_NAME = "CALENDAR_NAME";

    public static final String MISFIRE_INSTR = "MISFIRE_INSTR";

    public static final String JOB_DATA = "JOB_DATA";

}
