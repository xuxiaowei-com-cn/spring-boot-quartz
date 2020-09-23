package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * quartz 定时任务表
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-09-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("quartz")
public class Quartz extends Entity {

    private static final long serialVersionUID = 1L;

    /**
     * quartz 定时任务表主键
     */
    @TableId(value = "quartz_id", type = IdType.AUTO)
    private Long quartzId;

    /**
     * quartz 定时任务名
     */
    @TableField("quartz_name")
    private String quartzName;

    /**
     * quartz 定时任务描述
     */
    @TableField("quartz_description")
    private String quartzDescription;

    /**
     * quartz 定时任务 cron 表达式
     */
    @TableField("quartz_cron_expression")
    private String quartzCronExpression;

    /**
     * quartz 定时任务调用的全限定名
     */
    @TableField("quartz_bean_class")
    private String quartzBeanClass;

    /**
     * quartz 定时任务状态
     */
    @TableField("quartz_status")
    private String quartzStatus;

    /**
     * quartz 定时任务分组
     */
    @TableField("quartz_group")
    private String quartzGroup;


    public static final String QUARTZ_ID = "quartz_id";

    public static final String QUARTZ_NAME = "quartz_name";

    public static final String QUARTZ_DESCRIPTION = "quartz_description";

    public static final String QUARTZ_CRON_EXPRESSION = "quartz_cron_expression";

    public static final String QUARTZ_BEAN_CLASS = "quartz_bean_class";

    public static final String QUARTZ_STATUS = "quartz_status";

    public static final String QUARTZ_GROUP = "quartz_group";

}
