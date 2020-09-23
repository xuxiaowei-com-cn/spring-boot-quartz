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
@TableName("qrtz_calendars")
public class QrtzCalendars implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SCHED_NAME")
    private String schedName;

    @TableField("CALENDAR_NAME")
    private String calendarName;

    @TableField("CALENDAR")
    private String calendar;


    public static final String SCHED_NAME = "SCHED_NAME";

    public static final String CALENDAR_NAME = "CALENDAR_NAME";

    public static final String CALENDAR = "CALENDAR";

}
