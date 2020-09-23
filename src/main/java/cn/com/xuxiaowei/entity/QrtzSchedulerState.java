package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("qrtz_scheduler_state")
public class QrtzSchedulerState implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SCHED_NAME")
    private String schedName;

    @TableField("INSTANCE_NAME")
    private String instanceName;

    @TableField("LAST_CHECKIN_TIME")
    private Long lastCheckinTime;

    @TableField("CHECKIN_INTERVAL")
    private Long checkinInterval;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String INSTANCE_NAME = "INSTANCE_NAME";

    public static final String LAST_CHECKIN_TIME = "LAST_CHECKIN_TIME";

    public static final String CHECKIN_INTERVAL = "CHECKIN_INTERVAL";

}
