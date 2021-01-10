package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 简单的触发器表
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("qrtz_simple_triggers")
public class QrtzSimpleTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SCHED_NAME")
    private String schedName;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("REPEAT_COUNT")
    private Long repeatCount;

    @TableField("REPEAT_INTERVAL")
    private Long repeatInterval;

    @TableField("TIMES_TRIGGERED")
    private Long timesTriggered;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String TRIGGER_NAME = "TRIGGER_NAME";

    public static final String TRIGGER_GROUP = "TRIGGER_GROUP";

    public static final String REPEAT_COUNT = "REPEAT_COUNT";

    public static final String REPEAT_INTERVAL = "REPEAT_INTERVAL";

    public static final String TIMES_TRIGGERED = "TIMES_TRIGGERED";

}
