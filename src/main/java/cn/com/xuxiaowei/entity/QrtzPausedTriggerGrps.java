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
@TableName("qrtz_paused_trigger_grps")
public class QrtzPausedTriggerGrps implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SCHED_NAME")
    private String schedName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String TRIGGER_GROUP = "TRIGGER_GROUP";

}
