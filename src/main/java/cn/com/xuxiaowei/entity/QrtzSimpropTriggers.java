package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
@TableName("qrtz_simprop_triggers")
public class QrtzSimpropTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SCHED_NAME")
    private String schedName;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("STR_PROP_1")
    private String strProp1;

    @TableField("STR_PROP_2")
    private String strProp2;

    @TableField("STR_PROP_3")
    private String strProp3;

    @TableField("INT_PROP_1")
    private Integer intProp1;

    @TableField("INT_PROP_2")
    private Integer intProp2;

    @TableField("LONG_PROP_1")
    private Long longProp1;

    @TableField("LONG_PROP_2")
    private Long longProp2;

    @TableField("DEC_PROP_1")
    private BigDecimal decProp1;

    @TableField("DEC_PROP_2")
    private BigDecimal decProp2;

    @TableField("BOOL_PROP_1")
    private String boolProp1;

    @TableField("BOOL_PROP_2")
    private String boolProp2;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String TRIGGER_NAME = "TRIGGER_NAME";

    public static final String TRIGGER_GROUP = "TRIGGER_GROUP";

    public static final String STR_PROP_1 = "STR_PROP_1";

    public static final String STR_PROP_2 = "STR_PROP_2";

    public static final String STR_PROP_3 = "STR_PROP_3";

    public static final String INT_PROP_1 = "INT_PROP_1";

    public static final String INT_PROP_2 = "INT_PROP_2";

    public static final String LONG_PROP_1 = "LONG_PROP_1";

    public static final String LONG_PROP_2 = "LONG_PROP_2";

    public static final String DEC_PROP_1 = "DEC_PROP_1";

    public static final String DEC_PROP_2 = "DEC_PROP_2";

    public static final String BOOL_PROP_1 = "BOOL_PROP_1";

    public static final String BOOL_PROP_2 = "BOOL_PROP_2";

}
